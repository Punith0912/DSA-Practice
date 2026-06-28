package BasicRecursionAndBackTracking.backtracking;

public class PrintReverseNumBT {
	
	
	public static void main(String[] args) {
		printReverseNum(1,4);
	}

	private static void printReverseNum(int i, int j) {
		
		if(i > j)
			return;
		
		printReverseNum(i+1, j);
		System.out.println(i);
	}

	
}
