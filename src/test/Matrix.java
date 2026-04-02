package test;

public class Matrix {

	static void matrix() {

		int[][] a = new int[3][3];
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				   a[i][j] = count ++;
				   System.out.print(a[i][j] + " ");
			}
			 System.out.println();
		}

		int[][] aa = new int[3][3];
		int countt =0;
		int counttt =0;
		for (int i = a.length-1; i >=0; i--) {
			for (int j = 0; j < a.length; j++) {
				aa[countt][counttt] =  a[j][i];
				System.out.print(a[j][i]);
				System.out.print(aa[countt][counttt]);
				counttt++;
			}
			  System.out.println();
			  countt++;
			  counttt=0;
		}

	}

	public static void main(String[] args) {
		matrix();

	}

}
