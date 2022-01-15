package c3;

import java.util.Arrays;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int lt=0;
		int rs=0;
		int cnt=0;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int rt=0;rt<n;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			rs=Math.max(rs, rt-lt+1);
		}
		System.out.println(rs);
	}
}
