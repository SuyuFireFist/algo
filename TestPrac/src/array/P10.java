package array;

import java.util.Arrays;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		int count=0;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n+2;i++) {
			arr[0][i]=0;
			arr[i][0]=0;
			arr[n+1][i]=0;
			arr[i][n+1]=0;
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<n+1;j++) {
				if( arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1] &&  arr[i][j]>arr[i-1][j] &&  arr[i][j]>arr[i+1][j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
