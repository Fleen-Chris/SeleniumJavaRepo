package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement favourite = driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::span"));
		favourite.click();
		
		
		// checking weather clicking on same button again, disables radio button or not.
		
		favourite.click();
		
		String attribute = favourite.getDomAttribute("class");
		
		if (attribute != null && attribute.contains("ui-icon-bullet")) 
		    System.out.println("When clicked for sencond time, Radio button is not deselected");
		else
			System.out.println("When clicked for sencond time, Radio button is deselected");
		
				
		// checking radio button that is selected by default
		
		WebElement defaultclicked = driver.findElement(
				By.xpath("//h5[text()='Find the default select radio button']/following-sibling::div//span[contains(@class,'ui-icon-bullet')]"));
		
		
		if (defaultclicked.isDisplayed() == true) 
		{		
			WebElement defaultselected = driver.findElement(
					By.xpath("//h5[text()='Find the default select radio button']/following-sibling::div//span[contains(@class,'ui-icon-bullet')]/ancestor::div[contains(@class,'ui-radiobutton')]/following-sibling::label"));		
			
			System.out.println("Default Radio button is selected is "+ defaultselected.getText());			
		}
		else
			System.out.println("Default Radio button is not selected");

				
		//checking to select the age group (21-40 Years) if not already selected
	  				
			WebElement agegroup = driver.findElement(By.xpath(
							"//label[text()='21-40 Years']/preceding-sibling::div//span[contains(@class,'ui-icon-bullet')]"));
	
			if (agegroup.isDisplayed() == true) 
			{
				System.out.println("Default 21-40 Years Radio button is already selected ");
			} 
			else {		
				System.out.println("Default 21-40 Years Radio button is not selected ");
				agegroup.click();
	}
		
		
		

	}}


