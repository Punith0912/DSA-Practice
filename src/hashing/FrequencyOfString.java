package hashing;

import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abacabbvd";
		
		int[] hash = new int[256];
		
		// pre Compute
		for(int i=0;i<str.length();i++) {
			hash[str.charAt(i)] = hash[str.charAt(i)] + 1;
		}
		
		System.out.println("How many char to find Frequency");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			//fetching
			char c = sc.next().charAt(0);
			System.out.println(hash[c]);
		}
		
		
		
	}
	
}
