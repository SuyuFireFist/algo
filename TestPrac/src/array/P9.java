package array;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int sum1,sum2;
		int rs=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			sum1=sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			rs=Math.max(rs, sum1);
			rs=Math.max(rs, sum2);
		}
		
		sum1=sum2=0;
		for(int i=0;i<n;i++) {
			sum1=arr[i][i];
			sum2=arr[i][n-i-1];
		}
		rs=Math.max(rs, sum1);
		rs=Math.max(rs, sum2);
		
		System.out.println(rs);
	}

}
