package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = {1,1,2,3,3,4};
		int[] arr2 = {1,2,3,3};

		List<Integer> intersection = findIntersection(arr1,arr2);
		
		System.out.println(intersection);
	}

	private static List<Integer> findIntersection(int[] arr1, int[] arr2) {

		int n1 = arr1.length;
		int n2 = arr2.length;

		int[] visited = new int[n2];

		List<Integer> intersection = new ArrayList<Integer>();

		for(int i =0 ;i<n1 ;i++) {

			for(int j =0; j<n2 ; j++) {

				if(arr1[i] == arr2[j]) {

					//check if it is already taken
					if(visited[j] == 0) {

						intersection.add(arr2[j]);
						visited[j] =1;	
					}
				}
				
				if(arr1[i] < arr2[j])
					break;

			}
		}
		return intersection;

	}

}
