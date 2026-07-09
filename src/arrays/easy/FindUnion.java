package arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindUnion {

	
	public static void main(String[] args) {
		
		int[] arr1 = {1,1,2,4,5};
		int[] arr2 = {2,3,5};
		
		List<Integer> unionArray = findIntersection(arr1,arr2);
		
		for(int num : unionArray) {
			System.out.print(num + " ");
		}
	}

	// Approach -2 two pointer
	
	private static List<Integer> findIntersection(int[] arr1, int[] arr2) {

		int n1 = arr1.length;
		int n2 = arr2.length;
		
		// traverses both arrays
		int i =0;
		int j=0;
		
		List<Integer> union = new ArrayList<>();
		
		while(i< n1 && j<n2) {
			
			if(arr1[i] <= arr2[j]) {
				
				// checking Duplicates (last index of set)
				
				if(union.isEmpty() || arr1[i] != union.get(union.size()-1))
				
					union.add(arr1[i]);
				
				i++;
			}
			else {
			
				if(union.isEmpty() ||  arr2[j] != union.get(union.size()-1))
				
					union.add(arr2[j]);
				
				j++;
			}
			
		}
		
		
		// adding 1st array remaining elements to the Set
		while(i < n1) {
					
			if(union.size() == 0 || arr1[i] != union.get(union.size()-1))
				union.add(arr1[i]);
			
			i++;
		}
		
		// adding remaining elements of 2nd array to the set
		while(j < n2) {
			
			if(union.size() == 0 || arr2[j] != union.get(union.size()-1))
				union.add(arr2[j]);
			
			j++;
		}
		
		return union;
	}

//	private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
//		
//		int n1 = arr1.length;
//		int n2 = arr2.length;
//		
//		// Approach -1 use Set
//		
//		Set<Integer> unionSet = new TreeSet<Integer>();
//		
//		// adding 1st array to set
//		for(int i =0; i<n1;i++ ) {
//			unionSet.add(arr1[i]);
//		}
//		
//		//adding 2nd array to Set
//		for(int i=0;i<n2;i++) {
//			unionSet.add(arr2[i]);
//		}
//		
//		//copying set to array
//		
////		int[] unionArray = new int[unionSet.size()];
////		
////		int k=0;
////		for(Integer i : unionSet) {
////			unionArray[k++] = i;
////		
//
//		// or can return arrayList
//		
//		return new ArrayList<Integer>(unionSet);
//	}
//	
	
	
	
	
}
