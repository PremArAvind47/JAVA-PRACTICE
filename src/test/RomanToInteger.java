package test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		int first = 0;
		int second = 0;
		int num = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < s.length(); i++) {
			Integer mapp = map.get(s.charAt(i));
			if (first == 0) {
				first = mapp;
			} else {
				second = mapp;

				if (first >= second) {
					num = num + first;
					first = second;

				} else {
					int numm = second - first;
					 num = num + numm;
					first = 0;
					
				}
				second = 0;
			}

		}
		num = num + first;   // important
		return num;
	}

	public static void main(String[] args) {
		String s = "III";
		System.out.println(romanToInt(s));
		;
	}
}
