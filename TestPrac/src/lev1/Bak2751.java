package lev1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bak2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int count = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0;i<count;i++) {
			nums.add(sc.nextInt());
		}
		
		Collections.sort(nums);
		
		for(Integer rs : nums) {
			sb.append(rs);
		}
		System.out.println(sb);
	}

}
