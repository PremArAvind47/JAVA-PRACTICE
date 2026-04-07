package test;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		ValidParentheses vp = new ValidParentheses();

		String[] testCases = { "()", "()[]{}", "(]", "([])", "([)]" };

		for (String s : testCases) {
			System.out.println("Input: " + s + " -> " + vp.isValid(s));
		}
	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {

			// opening bracket → push
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			// closing bracket
			else {
				// no opening available
				if (stack.isEmpty())
					return false;

				char top = stack.pop();

				// mismatch check
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}

		// stack should be empty
		return stack.isEmpty();
	}
}