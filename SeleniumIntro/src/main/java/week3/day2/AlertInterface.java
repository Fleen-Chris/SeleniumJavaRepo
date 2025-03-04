package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement prompt = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));

		//driver.executeScript("arguments[0].click()", prompt);
		prompt.click();
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		alert.sendKeys("Testleaf");
		alert.dismiss();
		
		String res = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(res);
		
		driver.close();
		
		
		
		


	}

}
