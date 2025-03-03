package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {
	
	    public static void main(String[] args) {
	        
	        String[] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        //Adding the array elements to a List
	        List<String> list = new ArrayList<>(Arrays.asList(arr));

	        //Sorting the list in ascending order
	        Collections.sort(list);

	        Collections.reverse(list);

	        for (String element : list) {
	            System.out.print(element + ", ");
	        }
	    }
	}

