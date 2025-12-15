package test;

public class MaxOperations {
	public static int maxOperations(int[] nums, int k) {
		int count = 0;
		boolean[] used = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			for (int j = 1; j < nums.length; j++) {
				if (used[j])
					continue;
				int val = nums[i] + nums[j];
				if (k == val) {
					count++;
					used[i] = true;
					used[j] = true;
				}
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
