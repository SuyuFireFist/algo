package c4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		int rs=-1;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int l=j+1;l<n;l++) {
					ts.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		for(int x : ts) {
			cnt++;
			if(cnt==k) rs=x;
		}
		System.out.println(rs);
	}
}
