package arrays.easy;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5};
		
		//rotateBy1(arr);
		
		int k =3;
		rotateByK(arr, k);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void rotateByK(int[] arr, int k) {
		
		// approach 1
		int n= arr.length;
		int temp[] =new int[k];
		
		for(int i =0;i<k;i++) {
			temp[i]=arr[i];
		}
		
		for(int i =k;i<n;i++) {
			arr[i - k] = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i =0; i< k;i++) {
			
			System.out.println(n-k+" "+temp[i]);
			arr[n-k+i] = temp[i];
			
		}
	}

	private static void rotateBy1(int[] arr) {
		// storing 1st element 
		int temp = arr[0];
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			arr[i-1] = arr[i];
		}
		
		// replacing the stored 1st element to the last index
		arr[n-1]= temp;
	}
	
	
}
