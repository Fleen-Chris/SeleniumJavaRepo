package week3.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			// Selecting and checking if the message is been displayed properly.
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/login/");
			
			List <WebElement> anchorstext = driver.findElements(By.tagName("a"));
			
			 for ( int i= 0; i < anchorstext.size(); i++ )
			 {
				 WebElement wb = anchorstext.get(i);
				 String txt = wb.getText();
				 System.out.println(txt);
			 }
		
			 driver.close();

	}
	

}
