package week1.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	
	public static boolean areAnagrams(String fst, String secd)
	{
		if(fst.length() != secd.length())
			return false;
		
		
		char[] chFst = fst.toCharArray();
		char[] chSecd = secd.toCharArray();
		
		Arrays.sort(chFst);
		Arrays.sort(chSecd);
		
		return Arrays.equals(chFst, chSecd);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Words or Pharses: ");
		
		String first = scan.next();
		String second= scan.next();
		
		if(areAnagrams(first,second))
			System.out.println("These words are Anagrams.");
			
			else
				System.out.println("These words are not Anagrams.");
				
		scan.close();

	}

}
