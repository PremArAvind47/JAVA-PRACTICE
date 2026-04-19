package test;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String[] ss = s.split(" ");
		String k = "";
		StringBuilder sb = new StringBuilder();
		int max = 0;
		for (String d : ss) {
			sb.append("," + d);
		}
		k = sb.toString();
		String[] sss = k.split(",");
		for (int i = sss.length -1; i > 0; i--) {
          if(sss[i] != ",") {
        	return  sss[i].length();
        	  
          }
		}
		return max;

	}

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));

	}

}
