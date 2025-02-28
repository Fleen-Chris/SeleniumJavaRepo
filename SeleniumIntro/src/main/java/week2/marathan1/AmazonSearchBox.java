package week2.marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
		
		String fstResult = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		
		String scdResult = driver.findElement(By.xpath("//span[contains(text(),'results')]/following::span[2]")).getText();
		
		System.out.println("Results are: " +fstResult + " " +scdResult);
		
		driver.findElement(By.xpath("//div[@id = 'brandsRefinements']/ul//span[text()='Skybags']")).click();
		
		driver.findElement(By.xpath("//div[@id = 'brandsRefinements']/ul//span[text()='Safari']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String bagName = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span[text()='Safari']")).getText();
		System.out.println("Selected Bag Name is: "+  bagName);
		
		String bagPrice = driver.findElement(By.xpath("//span[@id='price-link']/following-sibling::a//span[@class='a-price-whole']")).getText();
		System.out.println("Selected Bag Price is: "+  bagPrice);
		
		System.out.println("Current Page is: "+  driver.getTitle());
		
		driver.close();
		

	}

}
