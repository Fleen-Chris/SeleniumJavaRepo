package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceTestcaseTwo extends SalesForceProjSpecMethods {
	
	@Test
	
	public void nameAsbyMyName() throws InterruptedException {
		
	 Thread.sleep(1000);

     WebElement sfName = driver.findElement(By.xpath("(//div[@class='actionBody']//dl[@class='slds-form']//records-record-layout-item//div[@part='input-text']//div)[1]"));
     
     sfName.sendKeys("Salesforce Automation by Fleena");
	
     WebElement sfCompName = driver.findElement(By.xpath("(//div[@class='actionBody']//dl[@class='slds-form']//records-record-layout-item//div[@part='input-text']//div)[2]"));
    
     //sfCompName.sendKeys("TestLeaf");
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].value='TestLeaf';", sfCompName);
	
	
     WebElement sfDiscrip = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container'])[2]/textarea"));
     sfDiscrip.sendKeys("Salesforces");
     
     WebElement dpNone = driver.findElement(By.xpath("//span[@class='slds-truncate'][@part='input-button-value']"));
     js.executeScript("arguments[0].click();", dpNone);
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Active']")).click();
    
     driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//button[@name='SaveEdit']")).click();

}}
