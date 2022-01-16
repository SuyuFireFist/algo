package sort;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[][] arr = new int[a][2];
		for(int i=0;i<a;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		Arrays.sort(arr, (o1,o2) -> {
			if(o1[0]==o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(int[] x : arr) {
			System.out.println(Arrays.toString(x).replace("[", "").replace("]", "").replace(",", ""));
		}
	}
}
