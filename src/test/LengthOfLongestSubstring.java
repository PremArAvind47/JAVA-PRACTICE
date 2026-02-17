package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubstring {

	   public boolean isPalindrome(int x) {
		   if (x < 0) return false;
		String ss = String.valueOf(x);
		String sss = new StringBuilder(ss).reverse().toString();
		long val = Long.valueOf(sss);
		 if(x == val) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int s =  1234567899;
		LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
		;
		System.out.println(lengthOfLongestSubstring.isPalindrome(s));
	}

}
