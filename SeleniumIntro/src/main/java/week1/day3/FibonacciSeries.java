package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8; 
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series up to " + range);
        
        for (int i = 0; i < range; i++) {
            System.out.print(a + " ");
            
            int nextval = a + b;
            a = b;
            b = nextval;
        }

	}

}
