package string;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String input1 = sc.next();
		String input2 = sc.next();
		
		String str1 = input1.toUpperCase();
		String str2 = input2.toUpperCase();
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(0)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
