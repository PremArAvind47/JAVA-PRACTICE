package test;

public class MyAtoi {

	private static int myAtoi(String s) {
		long num = 0;
		Boolean b = false;
		Boolean n = false;
		String ss = s.trim();

		for (int i = 0; i < ss.length(); i++) {
			if ('+' == ss.charAt(i) && i == 0) {
				continue;
			} else if (!Character.isDigit(ss.charAt(i)) && i == 0 && '-' != ss.charAt(i)) {
				return 0;
			} else if ('-' == ss.charAt(i) && i == 0) {
				b = true;
				continue;
			} else if ('-' == ss.charAt(i) && i != 0) {
				break;
			} else if (Character.isAlphabetic(ss.charAt(i))) {
				break;
			} else if ('0' == ss.charAt(i) && !n) {
				continue;
			} else if (!Character.isDigit(ss.charAt(i))) {
				break;
			} else if (Character.isDigit(ss.charAt(i))) {
				n = true;
				num = num * 10 + (ss.charAt(i) - '0');
				if (!b && num > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}

				if (b && -num < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			}

		}
		if (b) {
			num = num * -1;
		}
		return (int) num;

	}

	public static void main(String[] args) {
		String s = "   -042";
		System.out.println(myAtoi(s));
		;

	}

}
