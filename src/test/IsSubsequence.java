package test;

public class IsSubsequence {
	static Boolean isSubsequence(String s, String t) {
		int count = 0;
		Boolean c = false;
		for (int i = 0; i < t.length()&& count < s.length(); i++) {

			if (t.charAt(i) == s.charAt(count)) {
				count++;
			}

			c = s.length() == count;
		}
		return c;

	}

	public static void main(String[] args) {
		String s = "";
		String t = "ahgdcbaaa";
		System.out.println(isSubsequence(s, t));
		;
	}

}
