package BasicRecursionAndBackTracking.recursion;

public class ReverseArray {

	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int start_index =0;
		int end_index = arr.length-1;
		
	//	reverseArray(arr, start_index,end_index);
		
	    int n = arr.length;
		reverseArray(arr,0,n);
		
		for(int i=0; i<=end_index;i++) {
			System.out.print(arr[i] +" ");
		}
	}

	// approach - 1 two-pointers 
	
//	private static void reverseArray(int[] arr, int start_index, int end_index) {
//
//		if(start_index > end_index)
//			return;
//		
//		// recursion task ->  swapping 
//		int temp = arr[start_index];
//		arr[start_index]= arr[end_index];
//		arr[end_index]= temp;
//		
//		reverseArray(arr, start_index+1, end_index-1);
//		
//	}
	
	
// Approach -2
	
	// without using 2nd pointer  -> swap i in arr[n-i-1] index until i < n/2
	
	
	private static void reverseArray(int[] arr, int i, int n) {

		if( i> n/2)
			return;
		
		// recursion task ->  swapping 
		int temp = arr[i];
		arr[i]= arr[n-i-1];
		arr[n-i-1] = temp;
		
		
		reverseArray(arr,i+1, n-1);
		
	}
	
}
