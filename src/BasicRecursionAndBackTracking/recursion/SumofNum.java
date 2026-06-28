package BasicRecursionAndBackTracking.recursion;

public class SumofNum {

	
// approach -1 Parameterized way 

//	private static void sumOfNum(int i, int sum) {
//
//		
//
//		if(i<1) {
//			System.out.println(sum);
//			return;
//		}
//
//		sumOfNum(i-1, sum+i);
//	}
	
	
	// Approach-2 Functional -> returns  the result from the method itself

	
	public static int sumOfNum(int num) {
		
		if(num == 0)
			return 0;
		
		return num + sumOfNum(num-1);
		
	}

	public static void main(String[] args) {

		int n =5;
	// sumOfNum(4,0);
		int sum = sumOfNum(n);
		
		System.out.println(sum);

	}

}
