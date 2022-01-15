package array;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int count = 1;
		int[] arr = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=1;i<cnt;i++) {
			if(arr[i]>max) {
				max=arr[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
