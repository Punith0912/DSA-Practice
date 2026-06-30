package BasicRecursionAndBackTracking.recursion;

import java.awt.SecondaryLoop;

public class Fibonacci {

	public static void main(String[] args) {
		
		 int fibonacci = fibonacci(6);
		 System.out.println(fibonacci);
	}

	private static int fibonacci(int i) {
		
		if(i <= 1)
			return i;
//		
//		int last = fibonacci(i-1);
//		int secodLast = fibonacci(i-2);
//		return last + secodLast;
		
		return fibonacci(i-1) + fibonacci(i-2);
	}
}
