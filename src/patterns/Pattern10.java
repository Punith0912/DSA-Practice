package patterns;

public class Pattern10 {

	
	public static void main(String[] args) {
		
		int n= 5;
		
		
//		Approach -1 
		
//		//Increasing Star
//		for(int i=0;i<n; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//Decreasing Star
//		for(int i=0;i<n;i++) {
//			for(int j=0; j<n-i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
// Approach-2
		int stars =0;
		for(int i=1 ; i<n*2 ; i++) {
			if(i <= n)
				stars = i;
			else
				stars = 2*n - i;
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

//Pattern

//*
//**
//***
//****
//*****
//****
//***
//**
//*


