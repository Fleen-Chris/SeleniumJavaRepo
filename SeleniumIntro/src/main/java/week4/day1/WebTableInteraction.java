package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		// Makes automation harder to detect
		options.addArguments("--disable-blink-features=AutomationControlled");	
		options.addArguments("--incognito"); 
		options.addArguments("--guest"); 
		
		ChromeDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.get("https://erail.in/");
		
		driver.findElement(By.xpath("//div[@class='Menu']//td/label[text()='Sort on Date']/following::input[@type='checkbox']")).click();

		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='divTrainsList']//table//tr/td[2]"));
		int sizeCol = columns.size();		
		System.out.println("Total Number of coulmns listed: " +sizeCol);
		
		Set<String> trainNamesSet = new HashSet<>();
		
		for (int i = 2; i < sizeCol; i++) {
		    // Get elements for the second column
		    List<WebElement> names = driver.findElements(By.xpath("//div[@id='divTrainsList']//table//tr[" + i + "]/td[2]"));
		    
		    //Checking if the row exists before accessing it
		    if (!names.isEmpty()) { 
		        String trainName = names.get(0).getText();
		        if (!trainName.isEmpty()) 
		            trainNamesSet.add(trainName);
		        		    } 
		    else { //Skipping rows that doesnt exist
		        System.out.println("Skipping row " + i + " as it does not exist.");
		        }	    
		}
				
		System.out.println("Names of the Trains:");
		System.out.println(trainNamesSet);
		
	}
	}



