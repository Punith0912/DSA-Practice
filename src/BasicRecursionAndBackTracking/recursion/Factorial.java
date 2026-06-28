package BasicRecursionAndBackTracking.recursion;

public class Factorial {
	
	// Approach -1 Parameterized -> Stores the result in the parameter 
	
	public static void factorial(int num , int factorial) {
		
		if(num == 1) {
			System.out.println(factorial);
			return;
		}
		
		 factorial(num-1 ,  factorial * num);
		
	}
	
	
	
	
	// Approach - 2 Functional -> returns the result from the function
	
//
//	public static int factorial(int num) {
//		
//		if(num == 1)
//			return 1;
//		
//		return num * factorial(num -1);
//	}
	
	public static void main(String[] args) {
		
		int num = 5;
		
		factorial(num,1);
		
	//	int factorial = factorial(num);
	//	System.out.println(factorial);
	}
	
}
