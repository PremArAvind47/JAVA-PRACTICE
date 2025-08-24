package test;

public class Prime {
	public static void main(String[] args) {
		
		int n = 50;
		boolean isPrime = true;
		for(int i = 2; i<= n; i++ ) {
			for(int j = 2 ; j<=n/2; j++) {
				if(i%j == 0) {
					 isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println("it is prime" +i);
			}
		}

	}
}
