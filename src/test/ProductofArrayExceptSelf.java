package test;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	static int[] productExceptSelf(int[] arr) {
		int[] jrr = new int[4];
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			
			int m = 1;
			for (int j = 0; j < arr.length; j++) {
				if (!(i == j)) {
					m = m * arr[j];
					jrr[z] = m;
				}
			}
			jrr[z] = m;
			z++;
		}
		return jrr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(productExceptSelf(arr)));
		;
	}
}
