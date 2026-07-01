package basicMath;

public class Test {

// C:\Users\OO Manase\eclipse-workspace\Data Structure and Algorithm
	
	public static void main(String[] args) {
		
		f(3,3);
	}

	private static void f(int i, int j) {
		if(i==0)
			return;
		
		f(i-1,j);
		System.out.println(i);
	}
}

