package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		List<Integer> rsarr = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.reverse(arr);
		rsarr = arr.stream().distinct().collect(Collectors.toList());
		
		for(int i=0;i<s;i++) {
			arr2.add(rsarr.get(i));
		}

		for(int x : arr2) {
			System.out.print(x+" ");
		}
	}

}
