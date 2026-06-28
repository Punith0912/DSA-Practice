package BasicRecursionAndBackTracking.recursion;

public class StringPalindrome {

	public static void main(String[] args) {

		String s ="MADAM";
		int i = 0;
		int j = s.length()-1;

		boolean isPalindrome = palindrome(s, i,j);
		System.out.println(isPalindrome);
	}

	// Approach -1 -> two-pointer 
	
//	private static boolean palindrome(String s, int i, int j) {
//
//		if(i>j)
//			return true;
//
//		if(s.charAt(i) != s.charAt(j)) 
//			return false;
//
//		return palindrome(s, i+1, j-1);
//	}
	
	// Approach -2  without using 2nd pointer
	
	private static boolean palindrome(String s , int i, int n) {
		
		if(i > n/2)
			return true;
		
		if(s.charAt(i) != s.charAt(n-i))
			return false;
		
		return palindrome(s, i+1, n);
	}
	
}
