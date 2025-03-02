package week2.day3;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("Subclas method enter username which inherits super class TestData");
	}
	
	public void enterPassword()
	{
		System.out.println("Subclas method enter password which inherits super class TestData");
	}
	
	
	public static void main(String[] args) {
		
		LoginTestData data =new LoginTestData();
		
		System.out.println("Calling super class Methods:");
		
		data.enterCredentials();
		data.navigateToHomePage();
		
		System.out.println();
		
		System.out.println("Calling sub class Methods:");
		
		data.enterPassword();
		data.enterUsername();
		
		
		
	}


}
