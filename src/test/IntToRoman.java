package test;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

	public static String intToRoman(int num) {
		Map<String, Integer> m = new HashMap<>();

		m.put("I", 1);
		m.put("V", 5);
		m.put("X", 10);
		m.put("L", 50);
		m.put("C", 100);
		m.put("D", 500);
		m.put("M", 1000);

		int count = 0;
		int temp = 0;
		int tempp = num;

		while (num > 0) {
			int d = num % 10;
			temp = temp * 10 + d;
			count++;
			num = num / 10;
		}

		num = tempp;
		StringBuilder sb = new StringBuilder();

		// 1000s
		if (count == 4) {
			int c = num / 1000;
			for (int i = 0; i < c; i++) {
				sb.append("M");
			}
			num = num % 1000;
			count--;
		}

		// 100s
		if (count == 3) {
			int d = num / 100;
			num = num % 100;

			if (d <= 3) {
				for (int i = 0; i < d; i++)
					sb.append("C");
			} else if (d == 4) {
				sb.append("CD");
			} else if (d <= 8) {
				sb.append("D");
				for (int i = 0; i < d - 5; i++)
					sb.append("C");
			} else {
				sb.append("CM");
			}
			count--;
		}

		// 10s
		if (count == 2) {
			int d = num / 10;
			num = num % 10;

			if (d <= 3) {
				for (int i = 0; i < d; i++)
					sb.append("X");
			} else if (d == 4) {
				sb.append("XL");
			} else if (d <= 8) {
				sb.append("L");
				for (int i = 0; i < d - 5; i++)
					sb.append("X");
			} else {
				sb.append("XC");
			}
			count--;
		}

		// 1s
		if (count == 1) {
			int d = num;

			if (d <= 3) {
				for (int i = 0; i < d; i++)
					sb.append("I");
			} else if (d == 4) {
				sb.append("IV");
			} else if (d <= 8) {
				sb.append("V");
				for (int i = 0; i < d - 5; i++)
					sb.append("I");
			} else {
				sb.append("IX");
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(intToRoman(1994)); // MCMXCIV
		System.out.println(intToRoman(358)); // LVIII
		System.out.println(intToRoman(3749)); // MMMDCCXLIX

	}
}