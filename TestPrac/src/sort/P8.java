package sort;

import java.util.Arrays;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int rs =0;
		
		for(int i=0;i<a;i++) {
			if(arr[i]==b) {
				rs=i+1;
			}
		}
		System.out.println(rs);
	}
}
