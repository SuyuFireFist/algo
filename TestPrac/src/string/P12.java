package string;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String s = sc.next();
		for(int i=0;i<cnt;i++) {
			String s2 = s.substring(0,7).replace("#", "1").replace("*", "0");
			int bi = Integer.parseInt(s2,2);
			System.out.print((char)bi);
			s=s.substring(7);
		}
	}

}
