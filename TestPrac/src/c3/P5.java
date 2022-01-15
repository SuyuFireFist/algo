package c3;

import java.util.Arrays;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/2+1;
		int[] arr = new int[b];
		
		for(int i=0;i<b;i++) {
			arr[i]=i+1;
		}
		
		int lt=0;
		int sum=0;
		int cnt=0;
		
		for(int rt=0;rt<b;rt++) {
			sum+=arr[rt];
			if(sum==a) {
				cnt++;
			}
			while(sum>=a) {
				sum-=arr[lt++];
				if(sum==a) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
