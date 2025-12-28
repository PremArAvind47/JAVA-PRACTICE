package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueOccurrences {
	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : arr) {
			if (map.getOrDefault(n, 0) != 0) {
				map.put(n, map.getOrDefault(n, 0) + 1);
			} else {
				map.put(n, 1);
			}
		}
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for (Entry<Integer, Integer> m : map.entrySet()) {
			list.add(m.getValue());
		}
		for (int num : list) {
			if (!list1.contains(num)) {
				list1.add(num);
			} else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		int[] num = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(num));
	}

}
