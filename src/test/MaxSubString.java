package test;

public class MaxSubString {
	static int maxSubString(String s, int k) {
		char[] ss = s.toCharArray();
		String sss = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (sss.indexOf(ss[i]) == -1) {
				sss += s.charAt(i);
				count++;
			}
		}
		if (count == 0) {
			count = -1;
		}
		return count;

	}

	public static void main(String[] args) {
		String s = "aaaa";
		int k = 2;
		System.out.println(maxSubString(s, k));
	}
}
