package basicMath;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 121;
		
		int num=n;
		int palindrome=0;
		
		while(num>0) {
			int rem = num%10;
			palindrome = palindrome * 10 + rem;
			
			num/=10;
		}
		

		if(palindrome == n)
			System.out.println( true);
		else
			System.out.println(false);
	}

}
