package array;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr = new int[n];
		int sum=0;int rs=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				sum++;
				rs+=sum;
			}else {
				sum=0;
			}
		}
		System.out.println(rs);
	}

}
