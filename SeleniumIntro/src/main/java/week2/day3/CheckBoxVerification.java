package week2.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class CheckBoxVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Selecting and checking if the message is been displayed properly.
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		
		
		// Ajax Check
		
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		
		Thread.sleep(3000);
		
		String chkbox = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		String expected = "Checked";
		
		if (chkbox.equals(expected)) {
			
			System.out.println("Expected message is displayed.");
		}
		
		driver.findElement(By.xpath("//label[text()='Python']/preceding::div[1]")).click();
		
		
		// Tristate check
		
		driver.findElement(By.xpath("//div[@id=\"j_idt87:ajaxTriState\"]")).click();
		
		String checkBox = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		
		String actual = "State = 1";
		
		if(actual.equals(checkBox)) 
			
			System.out.println("Is State = 1");
				
		else
			
			System.out.println("Is not State = 1");
		
		String chkbx = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		if (chkbx.equals(expected)) {
			
			System.out.println("Expected message is displayed.");
		}
		
		
		
		// Toggle switch check
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();	
		
		
		WebElement verifychb = driver.findElement(By.xpath("//span[text()='Disabled']"));
			
		//System.out.println(verifychb.isEnabled());
		
		System.out.println(verifychb.isSelected());
		
		if (verifychb.isSelected()==false) {
			
			System.out.println("Toggle is Disabled");
		}
		
		
		
		// Multiple Select check
		
		WebElement cities = driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul[@data-label='Cities']"));
		
		cities.click();
		    		
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]/preceding::div[1]")).click();
		
		driver.findElement(By.xpath("(//label[text()='London'])[2]/preceding::div[1]")).click();
		
		
		// Checking for additional checks in MultiSelect options
		
		List<WebElement> options = driver.findElements(By.tagName("li"));
		
		List<WebElement> selectedOptions = new ArrayList<>();

		for (WebElement option : options) {
			
		    String className = option.getAttribute("class");
		    
		    if (className != null && className.contains("select")) {
		        selectedOptions.add(option);
		        
		    }}
		

		if (selectedOptions.size() > 1) {
			
			System.out.println("Multiple Options are Selected:");}
		
		else if (selectedOptions.size() == 1) {
		    System.out.println("Only one option is selected.");
		    
		} else {
		    System.out.println("No options are selected.");
		}

	
		List<WebElement> optedones = driver.findElements(By.xpath("//h5[text()='Select Multiple']/following-sibling::div//ul[contains(@class, 'ui-selectcheckboxmenu-multiple-container')]//span[@class='ui-selectcheckboxmenu-token-label']"));

		if (optedones.isEmpty()) {
		    System.out.println("No options are selected.");
		} 
		else {
		    System.out.println("Selected options are:");
		    
		    for (WebElement option : optedones) {
		        System.out.println(option.getText());
		    }
		}

	}}
		
		
		
		

	
		

