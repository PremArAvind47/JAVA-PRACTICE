package test;

import java.util.ArrayList;
import java.util.List;

public class SubsetsBit {

//	static List<String> subsetsBit(String s) {
//		List<String> l1 = new ArrayList<>();
//		List<String> l2 = new ArrayList<>();
//		List<String> result = new ArrayList<>();
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < s.length(); i++) {
//			sb.append(String.valueOf(s.charAt(i)));
//			for (int j = i + 1; j < s.length(); j++) {
//				sb.append(String.valueOf(s.charAt(j)));
//				l1.add(sb.toString());
//				boolean contains = l2.contains(sb.toString());
//				if (contains) {
//					result.add(sb.toString());
//				}
//			}
//			l2.addAll(l1);
//			l1.clear();
//			sb.delete(0, 1000);
//		}
//		
//		return result;
//	}

	public static void main(String[] args) {
		String hex = "1A";
		int decimal = Integer.parseInt(hex, 16);
		
		System.out.println(decimal);
	}

}
