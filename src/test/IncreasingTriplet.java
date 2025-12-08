package test;

public class IncreasingTriplet {
	public static boolean increasingTriplet(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] < nums[j] && nums[j] < nums[k]) {
						return true;
					}
				}

			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(increasingTriplet(arr));
		;
	}
}
