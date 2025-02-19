package week1.day3;

public class FibonacciSerieswithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8; 
        int[] array = new int[range]; 

        
        array[0] = 0;
        array[1] = 1;
        
        
        for (int i = 2; i < range; i++) 
        {
            array[i] = array[i - 1] + array[i - 2];
        }

        
        System.out.println("Fibonacci Series up to " + range);
        for (int i = 0; i < range; i++) 
        {
            System.out.print(array[i] + " ");
        }
    

	}

}
