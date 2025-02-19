package week1.day3;

public class IsPrimeNumber 
{
	public static boolean isPrime ( int num) 
		{
	if (num <= 1)
		return false;
	for(int i =2; i<num/2; i++)
	{
		if (num % i == 0)
			return false;
	}
	return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 13;
		
		if (isPrime(number))
		
			System.out.println(number + " Is prime number");
		else
			System.out.println(number + " Is not prime number");

	}

}
