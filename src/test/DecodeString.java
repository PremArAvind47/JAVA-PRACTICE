package test;

import java.util.Stack;

public class DecodeString {

	private static String decodeString(String s) {
		Stack<Integer> num = new Stack<>();
		Stack<String> sbStack = new Stack<>();
		// StringBuffer sb = new StringBuffer();
		String sss = "";
		int tempNum = 0;
		for (char ss : s.toCharArray()) {
			if (Character.isDigit(ss)) {
				tempNum = tempNum * 10 + (ss - '0');
			} else if (ss == '[') {
				num.add(tempNum);
				tempNum = 0;
				sbStack.add(sss);
				sss = "";
			} else if (ss == ']') {
				int n = 0;
				n = num.pop();
				String tempString = "";
				String string = sbStack.pop().toString();
				while (n > 0) {
					tempString = tempString + sss;
					n--;
				}
				sss = string + tempString;
			} else {
				sss = sss + ss;
			}
		}
		return sss;
	}

	public static void main(String[] args) {
		String s = "2[x3[y2[z]]p]q";
		System.out.println(decodeString(s));
	}
}
