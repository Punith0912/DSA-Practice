package BasicRecursionAndBackTracking.recursion;

public class CountDigit {

	public static void main(String[] args) {
		int num =12345;
	System.out.println(countDigit(num,0));	
	}

	private static int countDigit(int num, int i) {
		if(num <= 0)
			return i;
		
			num/=10;
		return countDigit(num, i+1);
	}
}
