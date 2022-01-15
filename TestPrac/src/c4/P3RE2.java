package c4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P3RE2 {

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
		
		for(int i=0;i<k-1;i++) {
			hs.add(arr[i]);
		}
		int lt=0;
		for(int rt=k-1;rt<n;rt++) {
			hs.add(arr[rt]);
			rs.add(hs.size());
			if(lt!=0) hs.remove(arr[lt]);
			lt++;
			System.out.println(hs);
		}
		for(int x : rs) {
			System.out.print(x + " ");
		}
	}

}
