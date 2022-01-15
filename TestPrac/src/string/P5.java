package string;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int lt=0,rt=input.length()-1;
		String rs;
		
		char[] ch = input.toCharArray();
		
		while(rt>lt) {
			if(!Character.isAlphabetic(ch[lt]))
				lt++;
			else if(!Character.isAlphabetic(ch[rt]))
				rt--;
			else {
				char tmp = ch[lt];
				ch[lt]=ch[rt];
				ch[rt]=tmp;
				lt++;rt--;
			}
		}
		rs=String.valueOf(ch);
		System.out.println(rs);
	}

}
