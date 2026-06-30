package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// taking input
		for(int i =0; i<size;i++) {
			
			System.out.print("Enter the elemtnt: ");
			arr[i]= sc.nextInt();
		}
		
		//PreCompute
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i < size; i++ ) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		System.out.println("Enter the number of element to find frequencies");
		int n = sc.nextInt();
		
		
		for(int i =0; i<n; i++) {
			
			System.out.println("Enter the Number to know frequency");
			int number = sc.nextInt();
			
			//Fetching
			System.out.println("The Frequency is" + map.getOrDefault(number, 0));
		}
		
		
	}

}
