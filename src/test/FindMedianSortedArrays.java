package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> l1 = new ArrayList<>();

		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();

		for (int ss : nums1) {
			l1.add(ss);
		}
		for (int ss : nums2) {
			l2.add(ss);
		}
		l3.addAll(l1);
		l3.addAll(l2);

		Collections.sort(l3);
		if (l3.size() % 2 != 0) {
			return l3.get(l3.size() / 2);
		} else {
			return (l3.get(l3.size()/2) + l3.get(l3.size()/2 -1)) / 2.0;
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 3 };
		int[] b = { 2 };
		System.out.println(findMedianSortedArrays(a, b));;

	}

}
