package week2.day3;

public class Elements extends Button{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("From Execution class:");
		Elements El=new Elements();
		El.setText("WelcomeToInheritance");
		El.submit();
		El.click();
		
		
		System.out.println();
		
		System.out.println("From CheckBoxButton class:");
		CheckBoxButton checkbox = new CheckBoxButton();
		checkbox.clickCheckButton();
		
		System.out.println();
		
		System.out.println("From RadioButtonSubclass class:");
		RadioButtonSubclass radioBtn = new RadioButtonSubclass();
		radioBtn.selectRadioButton();

		
		
		

	}

}
