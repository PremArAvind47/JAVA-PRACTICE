package test;

import java.util.Arrays;

public class MoveZeroes {
	static int[] moveZeroes(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			} else {
				arr[i - count] = arr[i];
			}
		}
		for (int i = arr.length - count; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 0, 0, 3, };
		int[] arrr = moveZeroes(arr);
		System.out.println(Arrays.toString(arrr));
		;

	}

}
