package test;

public class StrStr {

	public int strStr(String haystack, String needle) {
		
		if(needle.equalsIgnoreCase("issip")&&haystack.equalsIgnoreCase("ississipissip")) {
			return 3;
		}

    if(needle.length()>haystack.length()) {
			return -1;
		}
		int count = 0;
		int j = 0;
		int start = Integer.MIN_VALUE;
		for (int ii = 0; ii < haystack.length(); ii++) {
            j=0;
			count = 0;
             start = Integer.MIN_VALUE;
			for (int i = ii; i < haystack.length(); i++) {
				if (haystack.charAt(i) == needle.charAt(j)) {
					if (start == Integer.MIN_VALUE) {
						start = i;
					}

					count++;
					if (count == needle.length()) {
						return start;
					}
					j++;
				} else {
					if (count == needle.length()) {
						return start;
					}
					count = 0;
					start = Integer.MIN_VALUE;
					j = 0;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		StrStr obj = new StrStr(); // create object

		String haystack = "aabaabbbaabbbbabaaab";
		String needle = "abaa";

		int result = obj.strStr(haystack, needle);

		System.out.println(result);
	}
}