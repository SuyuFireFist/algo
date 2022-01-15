package string;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String rs = "";
		
		
		for(char x : input.toCharArray()) {
			if(Character.isDigit(x)) {
				rs += x;
			}
		}
		System.out.println(Integer.parseInt(rs));
	}
}
