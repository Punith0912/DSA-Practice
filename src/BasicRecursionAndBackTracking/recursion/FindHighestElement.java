package BasicRecursionAndBackTracking.recursion;

public class FindHighestElement {

	public static void main(String[] args) {
		
		int[] arr = {3,4,-3,0,5,2,1,8};
		
		int i=0;
		int highest = findHighest(arr,i,arr[i]);
		
		System.out.println(highest);
	}

	private static int findHighest(int[] arr, int i, int highest) {
		
		if(i >= arr.length) return highest;
		
		if(arr[i] > highest) highest = arr[i];
		
		
		return findHighest(arr,i+1,highest);
	}
}
