package hashing;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {

	public static void main(String[] args) {
		
		int[] arr = {5,1,3,4,1,5,2,3};
		
		findFrequency(arr);
	}

	private static void findFrequency(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//Counting Frequencies
		for(int i=0; i< arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		// Traverse Map 
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " freq" + entry.getValue());
		}
	}
}
