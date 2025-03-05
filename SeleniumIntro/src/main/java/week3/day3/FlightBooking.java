package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Prent Window ID:");
		
		System.out.println("Parent Window Name:" +driver.getTitle());
		
		//Alert alert = driver.switchTo().alert();
		
		//alert.dismiss();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		Set<String> openwd = driver.getWindowHandles();
		
		List<String> listwd = new ArrayList<String>(openwd);
		
		driver.switchTo().window(listwd.get(0));
		
		driver.close();
		
		//https://leafground.com/waits.xhtml
	}

}
