package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamicParameterization  extends week4.day3.SalesForceProjSpecMethods {
	
	@DataProvider(name="fetchData")
	public String[][] dataProvider() {
	
	
	String data[][] = new String[1][1];
	data[0][0] = "Salesforce Automation by Fleena";
	return data;
	}
	

	@Test(dataProvider="fetchData")
	public void nameAsbyMyName(String myName) throws InterruptedException {
		
	 Thread.sleep(1000);
     
     WebElement sfName = driver.findElement(By.xpath("(//div[@class='actionBody']//dl[@class='slds-form']//records-record-layout-item//div[@part='input-text']//div)[1]"));
     
     sfName.sendKeys(myName);
     
     driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//button[@name='SaveEdit']")).click();
     
     String expectedNme = driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//slot)[1]/lightning-formatted-text")).getText();
     
     
     Assert.assertEquals(expectedNme, myName);

}}
