package week1.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "changeme";
		
		for (int i=0; i < str.length(); i++)
		{
			if(i%2 != 0)
			{   // for odd index
				char uppercase = Character.toUpperCase(str.charAt(i));
				System.out.print(uppercase);				
			}
			else
				System.out.print(str.charAt(i));
		}

	}

}
