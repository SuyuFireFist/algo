package c3;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr = new int[n];
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
				if(sum>m) {
					break;
				}else if(sum==m) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
