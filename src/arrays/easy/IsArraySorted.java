package arrays.easy;

public class IsArraySorted {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,1};
		
		System.out.println(isSorted(arr));
	}

	private static boolean isSorted(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]< arr[i])
				return false;
		}
		
		return true;
	}
}
