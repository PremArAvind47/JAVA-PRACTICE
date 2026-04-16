package test;

public class SearchInsert {
	public static int searchInsert(int[] nums, int target) {
		int count = 0;
		for (int n : nums) {
			if (n == target) {
				return count;
			}
			count++;
		}
	
		
	for(int i =0; i < nums.length; i++) {
		int c = i + 1;
		
		if(nums[i] < target) {
			
			if(c  > nums.length-1) {
				return i+1;
			}
			if(nums[c] > target) {
				return i+1;
			}
			if(nums[c] > target) {
				return i;
			}
		}
	}

		return target;

	}

	public static void main(String[] args) {

		int[] nums = {1001};
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}

}
