package week3.day1;

public class ReverseOddWords {

	    public static void main(String[] args) {
	        String test = "I am a software tester";
	       
	        String[] words = test.split(" ");
	        
	        
	        for (int i = 0; i < words.length; i++) 
	        {
	            // Check if the index position is odd
	        	
	            if (i % 2 != 0) {
	                
	                char[] wordArray = words[i].toCharArray();
	                String reversedWord = "";
	                
	                
	                for (int j = wordArray.length - 1; j >= 0; j--) {
	                    reversedWord += wordArray[j];
	                }
	                
	                System.out.print(reversedWord + " ");
	            } else {
	                
	                System.out.print(words[i] + " ");
	            }
	        }
	    }
	}



