package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					driver.manage().window().maximize();
					
					driver.get("https://www.ajio.com/");
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			            // Wait until the search box is visible
			        WebElement bags = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")));
			        
					bags.sendKeys("bags");
					
					bags.sendKeys(Keys.RETURN);
					
					driver.findElement(By.xpath("//input[@name='genderfilter']/following-sibling::label[@for='Men']")).click();
					
					Thread.sleep(5000);
					
					WebElement fashionbg = driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[@for='Men - Fashion Bags']"));
										
					fashionbg.click();
					
					String fshbag = fashionbg.getText();
					
					System.out.println("Total count of items found are: " +fshbag);
					
					Thread.sleep(5000);
					
					List <WebElement> brand = driver.findElements(By.xpath("//a[descendant::div[@class='brand']]//strong"));
					
					System.out.println();					
					System.out.println("List of Brands diaplayed are:");
					System.out.println("---------------------------------");	
					
					 for ( int i= 0; i < brand.size(); i++ )
					 {
						 WebElement wbd = brand.get(i);
						 String txt = wbd.getText();					 
						 System.out.println(txt);
					 }
				
					 List <WebElement> namesofbag = driver.findElements(By.xpath("//a[descendant::div[@class='brand']]//div[@class='nameCls']"));
					 
					 System.out.println();					 				 
					 System.out.println("List of Bag Names diaplayed are:");
					 System.out.println("---------------------------------");	
					
					 for ( int i= 0; i < namesofbag.size(); i++ )
					 {
						 WebElement wnb = namesofbag.get(i);
						 String txt = wnb.getText();
						 System.out.println(txt);
					 }
				
					
					driver.close();
					
					
					
					
					
					

	}

}
