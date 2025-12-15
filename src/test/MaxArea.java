package test;

public class MaxArea {
	public static int maxArea(int[] height) {
		int result = 0;

		int i = 0; // left pointer
		int j = height.length - 1; // right pointer

		while (i < j) {
			int distance = j - i;
			int minHeight = Math.min(height[i], height[j]);
			int water = distance * minHeight;

			if (water > result) {
				result = water;
			}

			// move the shorter side
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		;
		System.out.println(maxArea(arr));
	}
}
