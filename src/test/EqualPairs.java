package test;

import java.util.Arrays;

public class EqualPairs {
	

	static int equalPairs(int[][] grid) {
		int l = grid[0].length;
		 int c =0;
		int count = 0;
		int columnnn =0;
		int roww =0;
		int co =0;
		int y = grid.length;
		for (int row = 0; row < grid.length; row++) {
			roww =0;
			int[] column = new int[grid.length];
			for (int columnn = 0; columnn < grid.length; columnn++) {
				while(c<y) {
					
					column[co] = grid[columnnn][roww];
					c++;
					co++;
					columnnn++;

				}
				c =0;
				co=0;
				columnnn=0;
				roww++;
			if (Arrays.equals(column,  grid[row])) {
				count++;
			}}
		}
		return count;

	}

	public static void main(String[] args) {
		int[][] a = { { 3, 2, 1 },
				{ 1, 7, 6 }, 
				{ 2, 7, 7 } };
		System.out.println(equalPairs(a));

	}

}
