package lev1;

import java.util.Arrays;
import java.util.Scanner;

public class Bak11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		int[] num = new int[people];
		int sum =0,maxtime=0;
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length;i++) {
			maxtime+=sum+num[i];
			sum+=num[i];
		}
		
		System.out.println(maxtime);
	}
}
