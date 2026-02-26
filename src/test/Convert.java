package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert {
	public static String convert(String s, int numRows) {
		int count = 0;
		int countIn = 0;
		Boolean b = true;
		List<Integer> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (b) {
				list.add(count++);
				if (count == numRows - 1) {
					b = false;
				}
			} else {
				list.add(count--);
				if (count == 0) {
					b = true;
				}
			}
		}
		for(int i =0; i<s.length();i++) {
			String ssss = String.valueOf(s.charAt(i));
			list1.add(ssss);
		}
		for(int i =0; i<s.length();i++) {
			for(int i1 =0; i1<s.length();i1++) {
	           int num = list.get(i1);
	           if(num == countIn) {
	        	   sb.append(list1.get(i1));
	           }
			}
			if(sb.length() == s.length()) {
				break;
			}
			countIn ++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		System.out.println(convert(s, numRows));;

	}

}
