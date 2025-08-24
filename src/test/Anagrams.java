package test;

import java.util.Arrays;

public class Anagrams {
	public static boolean method(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;

		if (s1.length() != s2.length())
			return false;

		char[] c = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		Arrays.sort(c);

		return Arrays.equals(c, c2);

	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(Anagrams.method(s1, s2));
	}
}
