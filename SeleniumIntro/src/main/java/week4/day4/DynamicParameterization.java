package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class DynamicParameterization extends week4.day3.ProjectSpecMethods {
	@DataProvider(name="fetchData")
	public String[][] dataprovider()
	{
		String data[][] = new String [2][2];
		
		data[0][0]="Testleaf";
		data[0][1]="243243234";
		
		data[1][0]="Qeagle";
		data[1][1]="98127";
				
		return data;
	}
	@Test(dataProvider="fetchData")
	public void runEditLead(String cname, String ph) throws InterruptedException {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Edit")).click();
	WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	companyName.clear();
	companyName.sendKeys(cname);
	driver.findElement(By.name("submitButton")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  Assert.assertEquals(text, cname);
	//SoftAssert sAt = new SoftAssert();
	//sAt.assertEquals(true, true);
}}
