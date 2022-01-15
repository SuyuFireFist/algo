package array;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a+1];
		int count=0;
		
		for(int i=2;i<=a;i++) {
			if(arr[i]==0) {
				count++;
				for(int j=i;j<=a;j=j+i) {
					arr[j]=1;
				}
			}
		}
		System.out.println(count);
	}
}
