package arrays.easy;

public class FindHighestElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,0,-4,2,1,8,-8};
		
		int largest = findLargest(arr);
		System.out.println(largest);
	}

	private static int findLargest(int[] arr) {
		
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}
}
