package array;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<num;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int x : arr) {
			System.out.print(x+ " ");
		}
	}

}
