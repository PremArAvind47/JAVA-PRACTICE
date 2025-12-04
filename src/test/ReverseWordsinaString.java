package test;

public class ReverseWordsinaString {
	static String reverseWordsinaString(String s) {
		String[] ss = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();

		for (int i = ss.length - 1; i >= 0; i--) {
			sb.append(ss[i]).append(" ");
		}
		return sb.toString().trim();

	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWordsinaString(s));
		;
	}
}
