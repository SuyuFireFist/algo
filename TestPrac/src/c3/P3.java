package c3;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int n = sc.nextInt();
		int rs,sum=0;
		
		int[] arr = new int[day];
		
		for(int i=0;i<day;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		
		rs=sum;
		
		for(int i=n;i<day;i++) {
			sum+=(arr[i]-arr[i-n]);
			rs=Math.max(rs, sum);
		}
		System.out.println(rs);
	}
}
