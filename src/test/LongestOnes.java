package test;

public class LongestOnes {
	public static int maxVowels(int[] nums, int k) {
		int kk = Integer.MIN_VALUE;
		int zeros = 0;
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			count++;

			if (nums[i] == 0 && kk == Integer.MIN_VALUE) {
				kk = i;
			}
			if (nums[i] == 0) {
				zeros++;
			}
			if (zeros > k) {
				i = kk;
				kk = Integer.MIN_VALUE;
				count = 0;
				zeros = 0;
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] num = { 0, 0, 1, 1 };
		int k = 1;
		System.out.println(maxVowels(num, k));

	}

}
