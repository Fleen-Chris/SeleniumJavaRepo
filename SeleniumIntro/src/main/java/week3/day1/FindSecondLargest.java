package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	    public static void main(String[] args) {
	        
	        int[] arr = {3, 2, 11, 4, 6, 7};

	        // Convert the array to a List
	        List<Integer> list = new ArrayList<>();
	        for (int num : arr) {
	            list.add(num);
	        }

	        Collections.sort(list);

	        // Second largest number
	        int secondLargest = list.get(list.size() - 2);

	        System.out.println("Second largest number is: " + secondLargest);
	    }
	}


