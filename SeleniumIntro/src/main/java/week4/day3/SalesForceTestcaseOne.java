package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceTestcaseOne extends SalesForceProjSpecMethods {
	
	@Test
	
	public void nameAsbyMyName() throws InterruptedException {
		
	 Thread.sleep(1000);
     
     WebElement sfName = driver.findElement(By.xpath("(//div[@class='actionBody']//dl[@class='slds-form']//records-record-layout-item//div[@part='input-text']//div)[1]"));
     
     sfName.sendKeys("Salesforce Automation by Fleena");
     
    driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//button[@name='SaveEdit']")).click();
     
     String actulNme = "Salesforce Automation by Fleena";
     
     String expectedNme = driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//slot)[1]/lightning-formatted-text")).getText();
     
     System.out.println(expectedNme);
     
     if(expectedNme.equals(actulNme))
     	System.out.println("Name displying action is completed");
     else
     	System.out.println("Name displying action is incomplete");
	
}}
