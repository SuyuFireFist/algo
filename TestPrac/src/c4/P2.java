package c4;

import java.util.HashMap;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String rs="";
		
		HashMap<Character,Integer> hs1 = new HashMap<>();
		HashMap<Character,Integer> hs2 = new HashMap<>();
		
		for(char x : a.toCharArray()) {
			hs1.put(x, hs1.getOrDefault(x, 0)+1);
		}
		
		for(char y : b.toCharArray()) {
			hs2.put(y, hs2.getOrDefault(y, 0)+1);
		}
		
		if(hs1.equals(hs2)) {
			rs="YES";
		}else {
			rs="NO";
		}
		System.out.println(rs);
	}

}
