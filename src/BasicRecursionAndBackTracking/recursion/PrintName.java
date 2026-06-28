package BasicRecursionAndBackTracking.recursion;

public class PrintName {

	
	public static void main(String[] args) {
		
		printName(1,4);
	}

	private static void printName(int i, int num) {
		
		if(i > num )
			return;
		
		System.out.println("Punith");
		
		printName(i+1, num);
	}
}
