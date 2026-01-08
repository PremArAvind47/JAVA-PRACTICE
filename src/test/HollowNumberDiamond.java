package test;

public class HollowNumberDiamond {

	public static void main(String[] args) {
		int n = 4;
		int count = n;
		int spaceCount = 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < count; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i != n) {
					if (j == 1 || j == i) {
						System.out.print(j + " ");
					} else {
						for (int j1 = 0; j1 < spaceCount; j1++) {
							System.out.print(" ");
						}
						spaceCount = 2;

					}
				} else {
					System.out.print(j + " ");
				}
			}
			count--;
			System.out.println();

		}
		int n1 = n-1;
		int n11 = n-1;
		int count1 = n1;
		int count11 = 0;
		int spaceCount1 = 2;
		for (int i = 1; i <= n1; i++) {
			for (int jj = 1; jj <= count11; jj++) {
				System.out.print(" ");
			}
			count11++;
			for (int j = 1; j <= n11; j++) {
				if (i != n1) {
					if (i!= 1||j!=2) {
						System.out.print(" "+j);
					} else {
						for (int j1 = 0; j1 < spaceCount1; j1++) {
							System.out.print(" ");
						}
						spaceCount1 = 2;

					}
				} else {
					System.out.print(" "+j);
				}
			}
			n11--;
			
			count1--;
			System.out.println();

		}

	}

}
