package test;

public class RemoveStars {
	 static String removeStars(String s) {
		char[] ss = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (ss[i] != '*') {
				sb.append(ss[i]);
			} else {
				sb.deleteCharAt(sb.length()-1);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "leet**cod*e";
		removeStars(s);

	}

}
