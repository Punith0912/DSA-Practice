package sorting;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		bubbleSort(arr,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubbleSort(int[] arr, int length) {
		System.out.println("num");
		
		if(length==0) return;
		
		int flag = 0;
		for(int i=0;i<length-1;i++) {
			
			//Swaping the highest element
			if(arr[i] >= arr[i+1]) {
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1]= temp;
				flag+=1;
			}
		}
		if(flag ==0)return;
		bubbleSort(arr,length-1);
	}
}
