package test;

public class Pattern1 {

	static void pattern1(int n) {
		int count =1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			count = 1;
			System.out.println();

		}
	}

	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
	}

}
