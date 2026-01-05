package test;

public class Palindrome {

	static boolean palindrome(int a) {
		int aa = a;
		int reverse = 0;
		while (a > 0) {	
			int s = a % 10;
			reverse = reverse * 10 + s;
			a = a / 10;
		}
		return aa == reverse;
	}

	public static void main(String[] args) {
		String s = "dood";
		int a = 111;
		System.out.println(palindrome(a));
	}

}
