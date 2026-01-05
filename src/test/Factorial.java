package test;

public class Factorial {
	private static int factorial(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
	}

}
