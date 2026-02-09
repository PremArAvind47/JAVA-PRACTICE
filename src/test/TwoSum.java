package test;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] ii = new int[2];
					ii[0] = i;
					ii[1] = j;
					return ii;
				} else {
					continue;
				}
			}
		}
		return nums;

	}

	public static void main(String[] args) {
		int[] nums = {2,5,5,11};
		int target = 10;
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

}
