package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		
		if(arr.parallelStream().distinct().count()==n) {
			System.out.println("U");
		}else {
			System.out.println("D");
		}
	}
}
