package week1.day4;

public class FindDupes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 7, 7, 5, 9, 2, 3};

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Compare each element with the rest of the elements
            for (int j = i + 1; j < arr.length; j++) {
                // If a duplicate is found
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    break;  }
            }
		

	}

	}
}
        

