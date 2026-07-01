package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		int length = arr.length;
		bubbleSort(arr,length);
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubbleSort(int[] arr,int n) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	
	
	

}
