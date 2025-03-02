package week2.day3;

public class Chrome extends Browser{
	
	public void openIncognito() {
		
		System.out.println("Open Incognito mode.");
	}

	public void clearCache() {
		
		System.out.println("Please clear Cache.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome ch = new Chrome();
		
		ch.browserName="Chrome";
		
		System.out.println(ch.browserName);
				
		ch.browserVersion = "315";
		
		System.out.println(ch.browserVersion);
		
		ch.closeBrowser();
		
		ch.navigateBack();
		
		ch.openURL();
		
		ch.openIncognito();
		
		ch.clearCache();
		
		
		

	}

}
