package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZero {

	public static void main(String[] args) {
		
		int[] arr = {1,0,2,3,4,0,0,5,6,0,0};
		
		moveZero(arr);
		
		for(int i =0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	private static void moveZero(int[] arr) {
		
		// brute force
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0 ;i< arr.length ; i++) {
//			
//			if(arr[i] != 0)
//				list.add(arr[i]);
//		}
//		
//		System.out.println(list.size());
//		
//		// copying elements from list
//		for(int i =0 ; i<list.size();i++) {
//			arr[i]=list.get(i);
//		}
//		
//		// adding zero to the last
//		
//		for(int i =list.size();i<arr.length;i++) {
//			arr[i] = 0;
//		}

	
	
	// optimal
	
		int j=-1;
		
		//finding first zeroth index
		
		for(int i =0;i< arr.length;i++) {
			if(arr[i] == 0) {
				j=i;
				break;
			}
		}
		
	for(int i = j+1;i< arr.length;i++ ) {
		
		if(arr[i] != 0) {
			
			//swaping
			arr[j] = arr[i];
			arr[i] = 0;
			j++;
		}
	}
		
}
	
}
