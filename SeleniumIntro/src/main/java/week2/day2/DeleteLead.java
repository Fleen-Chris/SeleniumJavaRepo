package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("888765");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(1000);
					
		String text = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext'])[1]")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext'])[1]")).click();
		
		//String leadid = leadId;
		
		//String href = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[text()='10582']")).getAttribute("href");
		
		//System.out.println(href);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/a[@class='subMenuButtonDangerous']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Find Leads")).click();			
		
		driver.findElement(By.xpath("//div/label[text()='Lead ID:']/following::input[@name='id']")).sendKeys(text);				
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(1000);
		
		String record = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		System.out.println(record);
		
		String expected = "No records to display";
		
		if(record.equals(expected))
		
			System.out.println("Deletion Succesful");
		
		else
			
			System.out.println("Deletion not Succesful");
		
		driver.close();		
				

	}

}
