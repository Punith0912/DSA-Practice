package arrays.easy;

public class K_LeftRotation {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int k = 3;
		
		
		rotateByK(arr,k);
		
		for(int i=0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	// approach 1
	//
//		private static void rotateByK(int[] arr, int k) {
//			
//			
//			int n= arr.length;
//			
//			// applying mod to eliminate extra rotation if k is greater than N
//			k = k%n;
//			
//			
//			int temp[] =new int[k];
//			
//			// Storing the k elements in temp array
//			for(int i =0;i<k;i++) {
//				temp[i]=arr[i];
//			}
//			
//			// shifting k to nth element 
//			for(int i =k;i<n;i++) {
//				arr[i - k] = arr[i];
//			}
//			
//			//adding the K temp array elements to last
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
//			
//			for(int i =0; i< k;i++) {
//				
//				System.out.println(n-k+" "+temp[i]);
//				arr[n-k+i] = temp[i];
//				
//			}
//		}
		
		
		// approach 2
		
		private static void rotateByK(int[] arr, int k) {
			
			int n = arr.length;
			
			// to eliminate extra rotations
			k=k%n;
			
			reverseArray(arr,0,k-1);
			reverseArray(arr,k,n-1);
			reverseArray(arr,0,n-1);
			
			
		}

	private static void reverseArray(int[] arr, int i, int k) {
		
		while(i <= k) {
			int temp = arr[i];
			arr[i]=arr[k];
			arr[k]= temp; 
			
			i++;
			k--;
		}
	}
	
}
