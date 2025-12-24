package test;

public class MaxVowels {

	 public static int maxVowels(String s, int k) {
	        int count = 0;
	        int max = 0;

	        // first window
	        for (int i = 0; i < k; i++) {
	            if ("aeiou".indexOf(s.charAt(i)) != -1) {
	                count++;
	            }
	        }

	        max = count;

	        // sliding window
	        for (int j = k; j < s.length(); j++) {
	            if ("aeiou".indexOf(s.charAt(j - k)) != -1) {
	                count--;
	            }
	            if ("aeiou".indexOf(s.charAt(j)) != -1) {
	                count++;
	            }
	            max = Math.max(max, count);
	        }

	        return max;
	    }
	 
	public static void main(String[] args) {
		String s = "leetcode";
		int k = 3;
		System.out.println(maxVowels(s, k));
	}

}
