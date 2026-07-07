package arrays.easy;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5};
		
		rotateBy1(arr);
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
