package BasicRecursionAndBackTracking.backtracking;

public class PrintNumBackTracking {

public static void main(String[] args) {
		
		print1ToN(4,4);
	}

	private static void print1ToN(int i, int num) {
		
		if(i < 1 )
			return;
		
		print1ToN(i-1, num);
		System.out.println(i);
	}
	
}
