package array;

import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> rs = new ArrayList<>();
		rs.add(arr[0]);
		
		for(int i=1;i<cnt;i++) {
			if(arr[i]>arr[i-1])
				rs.add(arr[i]);
		}
		for(int a : rs) {
			System.out.print(a+" ");
		}
	}

}
