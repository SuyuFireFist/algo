package c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] arr1=new int[a];
		
		for(int i=0;i<a;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int b=sc.nextInt();
		int[] arr2=new int[b];
		
		for(int i=0;i<b;i++) {
			arr2[i] = sc.nextInt();
		}
		
		ArrayList<Integer> rs = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<a && p2<b) {
			if(arr1[p1]<arr2[p2]) rs.add(arr1[p1++]);
			else {
				rs.add(arr2[p2++]);
			}
		}
		
		while(p1<a) rs.add(arr1[p1++]);
		while(p2<b) rs.add(arr2[p2++]);
		System.out.println(rs);
	}

}
