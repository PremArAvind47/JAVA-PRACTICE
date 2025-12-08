package test;

public class StringCompression {

	static int compress(char[] arr) {

		String s = "";
		int count = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				s = s + arr[i - 1];
				if (count > 1) {
					s = s + count;
					count = 1;
				}
			}
		}
		s = s + arr[arr.length - 1];
		if (count > 1) {
			s = s + count;
		}
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		s.length();
		return s.length();
	}

	public static void main(String[] args) {
		char[] c = { 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd' };
		System.out.println(compress(c));
	}

}
