package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
							
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.snapdeal.com/");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[@class='leftHead topCats']//following::span[text()=\"Men's Fashion\"]"))).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		WebElement childElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='leftHead topCats']//following::span[text()=\"Men's Fashion\"]//following::span[text()='Footwear']//following::span")));
	
		act.moveToElement(childElement).click().perform();
		
		WebElement totalItems = driver.findElement(By.xpath("//h1[@class='category-name']/following::span"));
		
		System.out.println("Total items displayed under sports shoes for Mens are: "+totalItems.getText());
														
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		
		Thread.sleep(1000);
		
		String dpOption = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
	
		if (dpOption.equals("Price Low To High")) 
		    System.out.println("Option is selected!");
		 else 
		    System.out.println("Option is NOT selected!");
		
		WebElement priceBoxFrom = driver.findElement(By.xpath("//div[@class='price-text-box']/input[@class='input-filter']"));
		
		//priceBoxFrom.sendKeys(Keys.chord(Keys.CONTROL, "a"), "300");
		
		priceBoxFrom.clear();
		
		priceBoxFrom.sendKeys("300");
		
		WebElement priceBoxTo = driver.findElement(By.xpath("//div[@class='price-text-box']/input[@name='toVal']"));
		
		priceBoxTo.clear();
		
		priceBoxTo.sendKeys("500");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(1000);
		
		WebElement quick = driver.findElement(By.xpath("(//section[@class='js-section clearfix dp-widget dp-fired']//div[contains(@class, 'product-tuple-listing')])[1]"));
				
		quick.click();
		
		Thread.sleep(1000);
		
		System.out.println("Title of the window: "+driver.getTitle());
		
		Set<String> allOpenedWindows = driver.getWindowHandles();
		
		List<String> shiftFocusTo = new ArrayList<String>(allOpenedWindows);
		
		System.out.println("------- ALL window Handler Name/id -------");
		
		for (String windowsName : allOpenedWindows) {
			System.out.println(windowsName);
			}
		
		driver.switchTo().window(shiftFocusTo.get(1));
		
		Thread.sleep(1000);
		
		//String discount = driver.findElement(By.xpath("//span[@class='pdpDiscount']/span")).getText();
		
		//System.out.println(discount);
				
		driver.findElement(By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']")).click();
		
		String price = driver.findElement(By.xpath("//div[@class='you-pay']/span")).getText();
		
		System.out.println(price);
		
		
				
	
		
	
	}

}
