package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesForceProjSpecMethods {
	
	WebDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void salesforcePreconditions(String url, String user, String pass)
	{
		ChromeOptions options = new ChromeOptions();
		
		// Makes automation harder to detect
		options.addArguments("--disable-blink-features=AutomationControlled");	
		options.addArguments("--incognito"); 
		options.addArguments("--guest"); 
		
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement leglentity = driver.findElement(By.xpath("//div[@id='lgt-accordion-section-179']//ul/li//p[text()='Legal Entities']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", leglentity);
        
        leglentity.click();
        
        WebElement recentNew = driver.findElement(By.xpath("//span[text()='Recently Viewed | Legal Entities List']"));
        
        js.executeScript("arguments[0].click();", recentNew);
        
        WebElement newLglEntity = driver.findElement(By.xpath("//div[@class='menuItemsWrapper']//span[text()='New Legal Entity']"));
        
        js.executeScript("arguments[0].click();", newLglEntity);
              
	}
	
	
	@AfterMethod
	public void postCondition() throws InterruptedException
	{
		Thread.sleep(1000);;
		driver.close();
		}
}
