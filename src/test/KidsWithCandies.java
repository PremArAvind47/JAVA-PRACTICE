package test;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = 0;
		List<Boolean> result = new ArrayList<>();
		for (int c : candies) {
			if (c > max) {
				max = c;
			}
		}
			for (int cc : candies) {
				result.add(cc + extraCandies >= max);
			}
	
		return result;
	}

	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

}
