package test;

import java.util.Arrays;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		boolean b = false;
		int k = nums.length - 1;
		int j = 0;
		int jj = 0;
		for (int i1 = 0; i1 < nums.length; i1++) {
			if (nums[i1] != val) {
				jj++;
			}
		}
		if (jj == 0) {
			for (int i1 = 0; i1 < nums.length; i1++) {
				nums[i1] = 0;
			}
			return jj;
		}
		
		
		
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				j++;
			}
			if (nums[i] == val && i == nums.length - 1) {
				nums[i] = 0;
			}

			if (nums[i] == val) {

				while (nums[k] == val) {

					k--;
					if (k == 0) {
						b = true;
						break;
					}

				}
				if (b) {

					nums[i] = 0;
					b = false;
					continue;

				}
				System.out.println(Arrays.toString(nums));

				nums[i] = nums[k];
				k--;
				if(k<0) {
					return jj;
				}
			}

		}
		System.out.println(Arrays.toString(nums));

		return j;

	}

	public static void main(String[] args) {

		int[] nums = {2,4,4,4,0};
		int val = 4;
		System.out.println(removeElement(nums, val));
	}

}
