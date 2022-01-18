package sort;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int first = 0;
		int last = 0;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			last += arr[i];
		}
		
		first = arr[n-1];
		
		while(first<=last) {
			int mid =(first+last)/2;
			
		}
		
	}

}
