package test;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
		if(s.length() == 0) return null ;
		if(s.length() == 1) return s ;
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		StringBuilder sb = new StringBuilder(); 
		List<String> result = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			   list.add(String.valueOf(s.charAt(i)));
			sb.append(String.valueOf(s.charAt(i)));
			for (int j = i+1; j < s.length(); j++) {
				sb.append(String.valueOf(s.charAt(j)));
                 list.add(sb.toString());
			}
			list1.addAll(list);
			list.clear();
			sb.setLength(0);
		}
		int count =0;
		List<String> pal = new ArrayList<>();
		for(String s1 : list1) {
			String h = list1.get(count++);
			if(h.equalsIgnoreCase(new StringBuilder(s1).reverse().toString())) {
				pal.add(h);
			}
		}
		int max = 0;
		String p = "";
		for(String s1 : pal) {
			int num = s1.length();
			if(max < num) {
			   p = s1;
				max = num;
			}
			
		}
		return p;
	}

	public static void main(String[] args) {
		String s = "babad";
		System.out.println(longestPalindrome(s));;
	}

}
