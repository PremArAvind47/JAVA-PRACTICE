package test;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {
	public static int maxOperations(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int num : nums) {
		    int need = k - num;

			if(map.getOrDefault(need,0) > 0) {
				count++;
				map.put(need, map.get(need)-1);
			}else {
				  map.put(num, map.getOrDefault(num, 0) + 1); // ✅ FIX

			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 4, 6, 5, 5, 1, 9 };
		int k = 10;
		System.out.println(maxOperations(nums, k));
	}
}
