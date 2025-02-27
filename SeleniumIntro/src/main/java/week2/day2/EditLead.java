package week2.day2;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        // Initialize WebDriver
		        ChromeDriver driver = new ChromeDriver();

		        try {
		            //  Load the URL
		            driver.get("http://leaftaps.com/opentaps/");

		            driver.manage().window().maximize();

		            //  Enter the Username and Password
		            driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		            driver.findElement(By.id("password")).sendKeys("crmsfa");

		            driver.findElement(By.className("decorativeSubmit")).click();
		            
		            driver.findElement(By.linkText("CRM/SFA")).click();

		            driver.findElement(By.linkText("Leads")).click();

		            driver.findElement(By.linkText("Create Lead")).click();

		            // Enter the CompanyName details using XPath
		            driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("System Corp");
		          
		            driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("John");
		          
		            driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Maiden");

		            driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Johnny");

		            // Enter the Details using Name locator
		            driver.findElement(By.name("departmentName")).sendKeys("Sales");

		            driver.findElement(By.name("description")).sendKeys("This is a test lead creation.");

		            driver.findElement(By.name("primaryEmail")).sendKeys("johnmaiden@example.com");

		            // Select State/Province using Visible Text
		            
		            WebElement stateDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		            Select selectState = new Select(stateDropdown);
		            selectState.selectByVisibleText("New York");
		          
		            driver.findElement(By.className("smallSubmit")).click();

		            driver.findElement(By.linkText("Edit")).click();
		            
		            Thread.sleep(1000);

		            //  Clear the Description Field
		            WebElement descriptionField = driver.findElement(By.name("description"));
		            descriptionField.clear();

		            driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an important note.");
		         
		            //  Click on the Update Button
		            driver.findElement(By.className("smallSubmit")).click();

		            //  Get the Title of the Resulting Page
		            
		            Thread.sleep(1000);
		            String pageTitle = driver.getTitle();
		            System.out.println("Page Title: " + pageTitle);

		        } 
		        catch (Exception e) {
		            e.printStackTrace();
		        } 
		        
		        finally {		        	
		        }  //  Close the browser window
		            driver.quit();
		        }
}
		    
		

	


