package c4;

import java.util.HashMap;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str = sc.next();
		
		HashMap<Character,Integer> hs = new HashMap<>();
		for(char x : str.toCharArray()) {
			hs.put(x, hs.getOrDefault(x, 0)+1);
		}
		int max=0;char rs=' ';
		
		for(char key : hs.keySet()) {
			if(max<hs.get(key)) {
				max=hs.get(key);
				rs=key;
			}
		}
		System.out.println(rs);
	}

}
