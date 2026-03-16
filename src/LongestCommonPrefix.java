
import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		List<String> l1 = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			for (int i1 = 0; i1 < strs[i].length(); i1++) {
				if (l1.isEmpty() && i != 0 && l1.size() == 0) {
					return "";
				}
				if (l1.contains("")) {
					return "";
				}
				if (i != 0) {
					try {
						l1.get(0).charAt(i1);
					} catch (Exception e) {
						if (i != strs.length) {
							continue;
						}
						return l1.get(0);
					}
					if (l1.get(0).charAt(i1) == strs[i].charAt(i1)) {
						sb.append(strs[i].charAt(i1));
					} else {
						if (i1 == 0) {
							return "";
						} else {
							break;
						}
					}
				} else {
					sb.append(strs[i].charAt(i1));
				}
			}
			l1.clear();
			l1.add(sb.toString());
			sb.delete(0, 1000000);
		}
		return l1.get(0);
	}

	public static void main(String[] args) {
		String[] strs = { "cb", "cbb", "a" };
		System.out.println(longestCommonPrefix(strs));

	}

}
