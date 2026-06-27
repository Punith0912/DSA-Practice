package basicMath;

public class CountDigits {

	public static void main(String[] args) {
		
		int n=123456;
		
//Approach-1
		
//		int count =0;
//		
//		while(n>0) {
//			count++;
//			//extract digits last but 1
//			n/=10;
//		}
//		System.out.println(count);
		
		
//Approach-2 (logarithm)
//log10(n) + 1 -> gives the count
		
	int count = (int) Math.log10(n) + 1;
	System.out.println(count);
		
	}
}
