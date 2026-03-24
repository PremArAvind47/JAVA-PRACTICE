import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsMatch {

	public static boolean isMatch(String s, String p) {
		return solve(s, p, 0, 0);
	}

	static boolean solve(String s, String p, int i, int j) {

		// pattern finished
			if (j == p.length()) {
				return i == s.length();
			}
	
			// check current match
			boolean match = (i < s.length() 
						&& (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
	
			// if next is '*'
			if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
	
				// 1. skip
				if (solve(s, p, i, j + 2))
					return true;
	
				// 2. take (repeat)
				if (match && solve(s, p, i + 1, j))
					return true;
	
				return false;
			}

		// normal move
		if (match) {
			return solve(s, p, i + 1, j + 1);
		}

		return false;
	}

	public static void main(String[] args) {
		String s = "aab";
		String p = "c*a*b";
		System.out.println(isMatch(s, p));
		;

	}

}
