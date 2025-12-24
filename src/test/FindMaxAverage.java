package test;

public class FindMaxAverage {
	private static double findMaxAverage(int[] nums, int k) {
		int i = 0;
		int sum = 0;
		while (i < k) {
			sum = sum + nums[i];
			i++;
		}

		int max = sum;
		int right = k;
		int j = 0;
		while (right < nums.length) {
			sum = sum - nums[j] + nums[right];
			if(sum > max ) {
				max = sum ;
			}
			j++;
			right++;
		}

		return (double)max/k;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;

		System.out.println(findMaxAverage(nums, k)); // 12.75
	}

}
