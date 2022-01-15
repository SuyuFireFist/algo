package asd;

import java.util.Scanner;

public class asd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] array = new int[n][m];
		int tmp = n * m;

		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					for (int j = m - 1; j >= 0; j--) {
						array[i][j] = tmp;
						tmp--;
					}
				else if (i % 2 != 0)
					for (int j = 0; j < m; j++) {
						array[i][j] = tmp;
						tmp--;
					}
			}
		} else if (n % 2 != 0) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					for (int j = 0; j < m; j++) {
						array[i][j] = tmp;
						tmp--;
					}
				else if (i % 2 != 0)
					for (int j = m - 1; j >= 0; j--) {
						array[i][j] = tmp;
						tmp--;
					}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
