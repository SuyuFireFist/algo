package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		int[] arr2 = new int[a];
		ArrayList<Integer> rs = new ArrayList<>();
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		arr2=arr.clone();
		Arrays.sort(arr2);
		
		for(int i=0;i<a;i++) {
			if(arr[i]!=arr2[i]) {
				rs.add(i+1);
			}
		}
		for(int x : rs) {
			System.out.print(x + " ");
		}
	}
}
