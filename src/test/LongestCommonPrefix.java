package test;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	private static String longestCommonPrefix(String[] strs) {

		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {

			for (int i1 = 0; i1 < strs[i].length(); i1++) {
				if (l1.isEmpty() && i != 0) {
					return "";
				}
				if (i != 0) {
					if (l1.get(0).charAt(i1) == strs[i].charAt(i1)) {
						sb.append(strs[i].charAt(i1));
					} else {
						if (i1 == 0) {

						} else {
							break;
						}

					}
				} else {
					sb.append(strs[i].charAt(i1));
				}

			}
			
			l1.clear();
			l1.add(sb.toString());
			sb.delete(0, 1000000);
//			if (i != 0) {
//				l1.clear();
//				l1 = new ArrayList<>(l2);
//				l2.clear();
//			}

		}

		return l1.get(0);

	}

	public static void main(String[] args) {
		String[] strs = ["dog","racecar","car"];
		System.out.println(longestCommonPrefix(strs));

	}

}
