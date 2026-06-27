package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		int n=5;

		//First Half Pyramid
		for(int i=0; i<n; i++) {

			//spaces
			for(int j=0; j<
					n-i-1; j++) {
				System.out.print(" ");
			}

			//stars
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Second half of the pyramid
		
		for(int i=0; i<n; i++) {
			
			//space
			for(int space=0;space<i; space++) {
				System.out.print(" ");
			}
			
			//stars
			for(int stars=0 ; stars<2*(n-i)-1; stars++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
