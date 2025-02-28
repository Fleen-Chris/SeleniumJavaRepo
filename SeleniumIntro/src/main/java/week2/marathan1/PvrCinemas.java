package week2.marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
			
			driver.manage().window().maximize();
			
			driver.get("https://www.pvrcinemas.com/%22");
			
			driver.findElement(By.xpath("//span[@class = 'cinemas-inactive']")).click();
			
			driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
			
			driver.findElement(By.xpath("//span[text()='INOX Salem Reliance Mall Salem']")).click();

			String cinemas = driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']//li)[1]/span")).getText();
			System.out.println("Selected Cinemas: "+  cinemas);
			
			Thread.sleep(1000);
			
			String date = driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).getText();
			System.out.println("Selected date: "+  date);
			
			driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();			
			
			Thread.sleep(1000);
			
			String movie = driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='AGHATHIYAA']")).getText();
			System.out.println("Selected movie: "+  movie);
			
			driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='AGHATHIYAA']")).click();
			
			Thread.sleep(1000);
			
			String time = driver.findElement(By.xpath("//span[text()='10:00 PM']")).getText();
			System.out.println("Selected time: "+  time);
			
			driver.findElement(By.xpath("//span[text()='10:00 PM']")).click();
						
			driver.findElement(By.xpath("//div[@class='quick-lefts ']//button[1]")).click();
			
			driver.findElement(By.xpath("//button[text()='Accept']")).click();
			
			Thread.sleep(1000);
			
			String seatno = driver.findElement(By.xpath("//td[@class='seats-col']/span[@class='seat-current-pvr']")).getText();
			System.out.println("Selected Seat No: "+  seatno);
			
			driver.findElement(By.xpath("//td[@class='seats-col']/span[@class='seat-current-pvr']")).click();
			
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			
					
			String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//h6//span")).getText();		
			System.out.println("GrandTotal: "+  grandTotal);
			
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@class='cinema-house mobile-login-M'])[2]/preceding::i[1]")).click();
								
			String title = driver.getTitle();
			System.out.println("Page Title: " +title);
			
			driver.close();
					
			
			
	}

}
