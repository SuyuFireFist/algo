package array;

import java.util.Arrays;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rs =0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int count=0;
				for(int k=0;k<m;k++) {
					int pi=0,pj=0;
					for(int s=0;s<n;s++) {
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pj>pi) count++;
				}
				if(count == m) rs++;
			}
		}
		System.out.println(rs);
	}

}
