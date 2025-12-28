package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FindDifference {
	private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		HashSet<Integer> set1 = new HashSet<>();
		for (int num : nums1) {
			set1.add(num);
		}

		HashSet<Integer> set11 = new HashSet<>();
		for (int num : nums2) {
			set11.add(num);
		}
		List<HashSet<Integer>> set = new ArrayList<>();
		List<Integer> s1 = new ArrayList<>();
		List<Integer> s2 = new ArrayList<>();

		for (int num : set11) {
			if (!set1.contains(num)) {
				s1.add(num);
			}
		}
		for (int num : set1) {
			if (!set11.contains(num)) {
				s2.add(num);
			}
		}
		List<List<Integer>> set111 = new ArrayList<>();
		set111.add(s2);
		set111.add(s1);
		return set111;

	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };
		System.out.println(findDifference(nums1, nums2));

	}

}
