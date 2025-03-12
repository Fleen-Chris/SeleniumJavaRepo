package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecMethods {
	
	protected WebDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preconditions(String url, String user, String pass) {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
}
	@AfterMethod
	public void postCondition() throws InterruptedException
	{
		Thread.sleep(1000);;
		driver.close();
	}
}
