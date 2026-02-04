package test;

public class Rotatedmatrix {

	public static void main(String[] args) {

		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = m.length;

		System.out.println("Rotated matrix:");

		for (int col = 0; col < n; col++) {

			for (int row = n - 1; row >= 0; row--) {
				System.out.print(m[row][col] + " ");
			}

			System.out.println();
		}
	}
}
