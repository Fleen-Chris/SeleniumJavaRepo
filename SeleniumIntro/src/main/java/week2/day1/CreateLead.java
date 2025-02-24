package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testlesf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fleena");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("C");
		
		driver.findElement(By.name("submitButton")).click();
		
		String actual_title = "View Lead | opentaps CRM";
		
		String title = driver.getTitle();
		
		System.out.println("Title of the current page is: "+title);
		
		if ( actual_title.equals(title))
			
			System.out.println("Correct Title");
		
		else
			
			System.out.println("Incorrect Title");
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
