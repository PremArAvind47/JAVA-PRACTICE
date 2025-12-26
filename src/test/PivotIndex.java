package test;

public class PivotIndex {
	private static int pivotIndex(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		int left = 0;
		int right = 0;
		for (int i = 0; i < nums.length; i++) {
			right = sum - nums[i] - left;
			if (right == left) {
				return i;
			}
			left += nums[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
	}

}
