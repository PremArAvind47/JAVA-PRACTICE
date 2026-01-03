package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloseStrings {
	static boolean closeStrings(String s, String s1) {
		char[] h = s.toCharArray();
		char[] hh = s1.toCharArray();
		int sl = s.length();
		int s1l = s1.length();

		
		if (sl != s1l) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(h[i])) {
				map.put(h[i], 1);
			} else {
				map.put(h[i], map.get(h[i]) + 1);
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (!map1.containsKey(hh[i])) {
				map1.put(hh[i], 1);
			} else {
				map1.put(hh[i], map1.get(hh[i]) + 1);
			}
		}
		List<Character> list = new ArrayList<>();
		for (Character m1 : map.keySet()) {
			list.add(m1);

		}
		List<Character> list1 = new ArrayList<>();
		for (Character m2 : map1.keySet()) {
			list1.add(m2);

		}
		Collections.sort(list);
		Collections.sort(list1);
		System.out.println(list);
		System.out.println(list1);
		if (!list.equals(list1)) {
			return false;
		}
		List<Integer> list11 = new ArrayList<>();
		for (Integer m1 : map.values()) {
			list11.add(m1);

		}
		List<Integer> list111 = new ArrayList<>();
		for (Integer m2 : map1.values()) {
			list111.add(m2);

		}
		Collections.sort(list111);
		Collections.sort(list111);
		System.out.println(list111);
		System.out.println(list111);
		if (!list111.equals(list111)) {
			return false;
		}
		return true;
			

	}

	public static void main(String[] args) {
		String s = "cabbba";
		String s1 = "abbccc";

		System.out.println(closeStrings(s, s1));
	}
}
