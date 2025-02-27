package week2.day2;

//Using Select Class

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("TestleafSeleniumNextGeneration");
				
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement element = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		
		Select option = new Select(element);
		
		option.selectByValue("IND_HARDWARE");
		
		WebElement elementown = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		
		Select optionown = new Select(elementown);
		
		optionown.selectByVisibleText("S-Corporation");
		
		WebElement elementemp = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		
		Select optionemp = new Select(elementemp);
		
		optionemp.selectByValue("LEAD_EMPLOYEE");
		
        WebElement elementmarkt= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		
		Select optionmarkt = new Select(elementmarkt);
		
		optionmarkt.selectByIndex(6);
		
		WebElement elementstatepv= driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		Select optionstatepv = new Select(elementstatepv);
		
		optionstatepv.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String actual_title = "Account Details | opentaps CRM";
		
		String title = driver.getTitle();
		
		System.out.println("Title of the current page is: "+title);
		
		if( actual_title.equals(title))
			
			System.out.println("Correct Title");
		
		else
			
			System.out.println("Incorrect Title");
		
		Thread.sleep(20000);
		
		driver.close();
				

	}

}
