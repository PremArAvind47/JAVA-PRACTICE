package test;

public class CanPlaceFlowers {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;

		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				int left = (i == 0) ? 0 : flowerbed[i-1];
				int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i+1];
				if (right == 0 && left == 0) {
					flowerbed[i] = 1;

					count++;
				}
			}
		}
		return count >= n;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println(canPlaceFlowers(arr, n));
	}
}
