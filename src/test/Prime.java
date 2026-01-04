package test;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	static List<Integer> prime(int num) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			boolean b = true;
			for (int i1 = 2; i1 <= i / 2; i1++) {
				if (i % i1 == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				list.add(i);
			}
		}
		return list;

	}

	public static void main(String args[]) {
		int num = 10;
		System.out.println(prime(num));
	}
}
