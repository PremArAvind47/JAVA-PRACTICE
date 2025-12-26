package test;

public class LargestAltitude {
	static int largestAltitude(int[] gain) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < gain.length; i++) {
			sum = sum + gain[i];
			if (sum > max) {
				max = sum;
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int num[] = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(num));
	}

}
