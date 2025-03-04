package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomationAndAlertInteraction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement prompt = driver.findElement(By.xpath("//h2[text()='JavaScript Prompt']/following-sibling::button"));
		
		prompt.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Harry Potter");
		
		alert.accept();
		
		String name = driver.findElement(By.id("demo")).getText();
		
		if(name.contains("Harry Potter"))
			System.out.println("Action Performed");
		else
			System.out.println("Action not Performed");
		
		driver.close();	
		

	}

}
