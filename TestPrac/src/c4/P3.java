package c4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> rs = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();

		for(int i=0;i<=n-k;i++) {
			for(int j=i;j<i+k;j++) {
				hs.add(arr[j]);
			}
			rs.add(hs.size());
			hs.removeAll(hs);
		}
		for(int x : rs) {
			System.out.print(x+" ");
		}
	}
}
