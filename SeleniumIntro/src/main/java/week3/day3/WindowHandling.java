package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
        driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		// Shifting focus to the first opened window
		
		driver.findElement(By.xpath("//td/span[text()='From Contact']/ancestor::tr/td/a[img[contains(@src,'fieldlookup.gif')]]")).click();
		
		Set<String> openedwindowHandles = driver.getWindowHandles();
		
		List<String> shiftfocusTo = new ArrayList<String>(openedwindowHandles);
				
		driver.switchTo().window(shiftfocusTo.get(1));
		
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(shiftfocusTo.get(0));
		
		driver.findElement(By.xpath("//td/span[text()='From Contact']/ancestor::tr/following-sibling::tr/td[2]/a/img[contains(@src,'fieldlookup.gif')]")).click();
		
		// Shifting focus again to the latest opened window
				
        Set<String> openedwindowHandlesL = driver.getWindowHandles();
		
		List<String> shiftfocusToL = new ArrayList<String>(openedwindowHandlesL);
					
		driver.switchTo().window(shiftfocusToL.get(1));
		
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		driver.switchTo().window(shiftfocusTo.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		
		// Handling alerts
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println("Title of the window: " + driver.getTitle());
		
		driver.quit();
		
	

	}

}
