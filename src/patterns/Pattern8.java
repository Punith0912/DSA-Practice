package patterns;

public class Pattern8 {
public static void main(String[] args) {
	
	int n=5;
	
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

//Pattern
//*********
// *******
//  *****
//   ***
//    *
