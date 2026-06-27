package basicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllDivisors {

	public static void main(String[] args) {
		
		int num = 36;
		
		List<Integer> allDiv = new ArrayList<Integer>();
		for(int i=1; i<=Math.sqrt(num); i++) {
			
			
			if(num%i == 0) {
				allDiv.add(i);
				
				if(num/i != i) {
					allDiv.add(num/i);
				}
			}
		}
		allDiv.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(allDiv);
	}
}
