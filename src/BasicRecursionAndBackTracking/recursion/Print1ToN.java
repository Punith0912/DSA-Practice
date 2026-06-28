package BasicRecursionAndBackTracking.recursion;

public class Print1ToN {

	
	// Print 1 to N number using Recursion 
				
	public static void main(String[] args) {
		
		print1ToN(1,4);
	}

	private static void print1ToN(int i, int num) {
		
		if(i > num )
			return;
		
		System.out.println(i);
		
		print1ToN(i+1, num);
	}
	
}
