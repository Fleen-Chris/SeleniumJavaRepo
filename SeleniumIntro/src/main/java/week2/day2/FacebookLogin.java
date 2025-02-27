package week2.day2;

//Using Select Class

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
			
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
			
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234567890");
			
			//Using Select for drop downs
					
			WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			
			Select optionday = new Select(day);
			
			optionday.selectByValue("12");
					
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			
			Select optionmon = new Select(month);
			
			optionmon.selectByValue("4");
			
			WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			
			Select optionyr= new Select(year);
			
			optionyr.selectByValue("2002");
			
			driver.findElement(By.xpath("//input[@value='1']")).click();
			
			driver.close();
			
			
			

	}

}
