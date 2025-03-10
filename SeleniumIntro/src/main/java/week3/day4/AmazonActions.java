package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		// Makes automation harder to detect
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		options.addArguments("--incognito"); 
			
		options.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("oneplus 9 pro");
		
		searchBox.sendKeys(Keys.RETURN);
		
		String price = driver.findElement(By.xpath("//h2[text()='Results']//following::span[contains(text(),'OnePlus 13R | Smarter with OnePlus AI (12GB RAM, 2')]//following::span[@class='a-price-whole']")).getText();
		
		System.out.println("The price of the product selected is: "+price);
		
		Thread.sleep(2000);
		
		// Using javascript to fetch ratings data
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

		WebElement rating = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(@aria-label, 'out of 5 stars')]/i/span)[1]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ratings = (String) js.executeScript("return arguments[0].textContent;", rating);

		System.out.println("The ratings of the product selected is: " + ratings);

		
		driver.findElement(By.xpath("//h2[text()='Results']//following::span[contains(text(),'OnePlus 13R | Smarter with OnePlus AI (12GB RAM, 2')]")).click();
		
		System.out.println("Title of the window: "+driver.getTitle());
		
		// Handling windows
		Set<String> allOpenedWindows = driver.getWindowHandles();
		
		List<String> shiftFocusTo = new ArrayList<String>(allOpenedWindows);
		
		System.out.println("------- ALL window Handler Name/id -------");
		
		for (String windowsName : allOpenedWindows) {
			System.out.println(windowsName);
			}
		
		System.out.println("------- ------------------- -------");
		
		driver.switchTo().window(shiftFocusTo.get(1));
		
		Thread.sleep(1000);
		
		// Taking screenshot
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./OnePluspage/phone.png");
		FileUtils.copyFile(scr, target);
			
		System.out.println("Title of the child window: " + driver.getTitle());
	
		Thread.sleep(1000);
		WebElement addtoCart = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
		
		addtoCart.click();
		
		String cartSubtotal= driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']//descendant::span[@id='attach-accessory-cart-subtotal']")).getText();
		
		System.out.println("The Cart Subtotal of the product selected is: "+cartSubtotal); 
		
		String expected = "₹42,998.00";
		
		if(cartSubtotal.equals(expected))
			System.out.println("Total is correct");
		else
			System.out.println("Total is not correct");
		
		driver.close();
		
		driver.switchTo().window(shiftFocusTo.get(0));
		
		driver.close();

	}

}
