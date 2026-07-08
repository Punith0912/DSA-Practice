package arrays.easy;

public class K_RightRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		rotateRight(arr,k);
		
		for(int i=0 ; i<arr.length ;i++) {
			System.out.println(arr[i]+ " ");
		}
	}

	private static void rotateRight(int[] arr, int k) {
		
		int n = arr.length;
		k = k%n;
		
		reverse(arr, 0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
	}

	private static void reverse(int[] arr, int st, int ed) {
		
		while(st < ed ) {
			
			int temp = arr[st] ;
			arr[st] = arr[ed];
			arr[ed] = temp;
			
			st++;
			ed--;
			
			
		}
	}
	
}
