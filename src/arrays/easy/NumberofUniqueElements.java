package arrays.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberofUniqueElements {
	
	// Return the number of Unique Number in Sorted array

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,3,3,4,5,5};
		
			int unique = findUnique(arr);
		
		for(int i=0;i<unique;i++ ) {
			System.out.println(arr[i]);
		}
	}

	private static int findUnique(int[] arr) {
		// Approach -1 - T(c) = 0(n log n)
		
//		Set<Integer> unique =new  HashSet<>();
//		
//		for(int i =0 ; i<arr.length ;i++) {
//			unique.add(arr[i]);
//		}
//		
//		return unique.size();
	
		// Approach-2 Two pointer
		
		int i= 0;
		for(int j=1;j<arr.length;j++) {
			
			if(arr[j]!= arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
			
		}
		return i +1;
		
		
	}
	
	//
	
}
