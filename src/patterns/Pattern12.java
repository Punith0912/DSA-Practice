package patterns;

public class Pattern12 {

	public static void main(String[] args) {
		
		int n=4;
		
		int space = 2*(n-1);
		
		//outer-Loop
		for(int i=1; i<=n; i++) {
			
			//numbers
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			//spaces
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			
			//numbers
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			
			//Reduce space by 2 after one coloumn
			space-=2;
			System.out.println();
		}
		
	}
}

//pattern
//1      1
//12    21
//123  321
//12344321
