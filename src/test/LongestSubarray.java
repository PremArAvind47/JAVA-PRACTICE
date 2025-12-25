package test;

public class LongestSubarray {
	public static int longestSubarray(int[] nums) {
		int k = Integer.MIN_VALUE;
		int count = 0;
		int max = 0;
		int zeros = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0 && k == Integer.MIN_VALUE) {
				k = i;
			}
			if (nums[i] == 0) {

				zeros++;
			}

			count++;

			if (zeros > 1) {
				zeros = 0;
				i = k;
				count = 0;
				k = Integer.MIN_VALUE;
			}
			if (count > max) {
				max = count;
			}
		}
		return max - 1;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1 };
		System.out.println(longestSubarray(nums));
	}
}
