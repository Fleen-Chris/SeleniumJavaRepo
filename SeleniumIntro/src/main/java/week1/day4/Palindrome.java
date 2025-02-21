package week1.day4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int enteredNum = scanner.nextInt();
        
        int number = enteredNum;
        int digit = 0;
        int reversednum = 0;
		
		while(number!=0)
		{
		digit = number % 10;
		reversednum = (reversednum * 10) + digit;
		number = number / 10;
		}
		
		// checking
		if(enteredNum==reversednum) 
			System.out.println("Given number is a Palindrome.");
			else
				System.out.println("Given number is not a Palindrome");
		
		scanner.close();	
		}
	}


