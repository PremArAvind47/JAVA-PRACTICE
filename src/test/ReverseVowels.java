package test;

public class ReverseVowels {

	static StringBuilder reverseVowels(String s) {
		String vowels = "aeiouAEIOU";
		char[] cc = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char c : cc) {
			if (vowels.indexOf(c) != -1)
				sb.append(c);
		}
		sb.reverse();
		StringBuilder sbb = new StringBuilder();
		int count = 0;
		for (char c : cc) {
			if (vowels.indexOf(c) != -1) {
				for (int i = 0; i < sb.length(); i++) {
					char ch = sb.charAt(count++);
					sbb.append(ch);
					break;
				}
			} else {
				sbb.append(c);
			}
		}
		return sbb;
	}

	public static void main(String[] args) {
		String s = "AceCreIm";
		StringBuilder dd = reverseVowels(s);
		System.out.println(dd);

	}
}
