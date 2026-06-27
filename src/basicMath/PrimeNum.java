package basicMath;

public class PrimeNum {

	public static void main(String[] args) {

		int num = 11;


// Approah - 1  O(n)	

		//		int count =0;
		//		for(int i = 1; i<=num; i++) {
		//			if(num%i == 0)
		//				count++;
		//		}
		//		
		//		if(count ==2)
		//			System.out.println(true);
		//		else
		//			System.out.println(false);

// Aproach-2

		int count =0;
		for(int i=1; i<=Math.sqrt(num);i++) {
			if(num% i == 0) {
				count++;

				// checking the divisor is same 
				if(num/i != i)
					count++;
			}

		}

		if(count == 2)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
