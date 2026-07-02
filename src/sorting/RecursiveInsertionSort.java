package sorting;

public class RecursiveInsertionSort {
	
	

	public static void main(String[] args) {
		int[] arr= {4,3,2,1};
		
		insertionSort(arr,0);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionSort(int[] arr, int i) {
		if(i==arr.length) return;
		
		for(int j=i; j>0 ;j-- ) {
			if(arr[j]< arr[j-1]) {
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		
		
		insertionSort(arr, i+1);
	}
	
}
