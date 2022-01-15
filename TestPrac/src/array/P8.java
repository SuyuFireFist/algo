package array;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] rs = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int rank=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					rank++;
				}
				rs[i]=rank;
			}
		}
		for(int x : rs) {
			System.out.print(x+" ");
		}
	}

}
