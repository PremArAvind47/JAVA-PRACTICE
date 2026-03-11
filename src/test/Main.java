package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface lamdaa {
	int s(List<Integer> x);
}

public class Main {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(11, 4, 3, 6757, 6787, 686, 2);
		List<Integer> l2 = Arrays.asList(11, 4, 3, 6757, 6787, 686, 2);
		List<Integer> ll = new ArrayList<>();
		// l.stream().filter((x)-> x%2 ==0).forEachOrdered((x)-> System.out.println(x));
		lamdaa ss = (x) -> {

			for (Integer g : x) {

				if (g % 2 == 0) {
					ll.add(g);
				}

			}
			return ll.size();
		};
		;
		System.out.println(ss.s(l));
	}
}