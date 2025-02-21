package week1.day4;

import java.util.Arrays;

public class FindMissingElement {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,3,2,8,6,7};		
		
		Arrays.sort(arr); 
		
			
		// to check for number 1 to 8 in range
		for (int i = 1; i <= 8; i++) {
			boolean found = false;
            
            // to check current number is in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            
            // so once the value is still not found and its false, print the missing number
         if (found==false) {
                System.out.println("Missing element is: " + i);
            }

	}

}
}
