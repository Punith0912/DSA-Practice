package arrays.easy;

public class SecondLargest {

	public static void main(String[] args) {

		 int[] arr = {1,2,0,4,2,1,8,-8};//
		//int[] arr = {4,2,1,4};

		int largest = findSecondLargest(arr);
		System.out.println(largest);
	}

	private static int findSecondLargest(int[] arr) {
		
		// if array contain negative value
		int largest =Integer.MIN_VALUE, secondLargest =Integer.MIN_VALUE;

		for(int i= 0; i< arr.length; i++) {
			
			if(arr[i] > largest ) {

				secondLargest = largest;
				largest = arr[i];
				continue;
				
			}if(arr[i] > secondLargest && arr[i] != largest)
				secondLargest = arr[i];
		}
		return secondLargest;
	}
}
