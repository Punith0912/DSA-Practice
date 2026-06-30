package hashing;

import java.util.HashMap;
import java.util.Map;

public class HigheshOccurance {

	public static void main(String[] args) {
		int[] arr = {3 ,-5, 0 ,-6, 0, 7, -10, -3, 1, -10};
		System.out.println(mostFrequentElement(arr));
	}

	public static int mostFrequentElement(int[] nums) {

		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i< nums.length; i++){
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		} 

		int max = 0; int num =0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){

			System.out.println(entry.getKey() + " Freq "+ entry.getValue());

			if(entry.getValue() > max) {
				max= entry.getValue();
				num = entry.getKey();
			}
			if(entry.getValue() == max ) {
				if(entry.getKey() >= num ) 
					num = entry.getKey();
			}

		}

		return num;
	}
}



