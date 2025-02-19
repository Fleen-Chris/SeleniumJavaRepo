package week1.day3;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange = 10;
		
		for (int i=0; i<=maxRange; i++)
		{
			if (i%2 == 1) {
				System.out.println(i +" Number is Odd");
			}
			else
				System.out.println(i +" Number is not Odd");
				
		}
		

	}

}
