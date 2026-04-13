package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
			}
		}
		return j+1;

	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		 System.out.println(removeDuplicates(a));


	}

}
