package string;

import java.util.Arrays;
import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] rs = input.split(" ");
		String word = "";
		
		for(int i=0; i<rs.length; i++) {
			if(rs[i].length()>word.length()) {
				word = rs[i];
			}
		}
		
		System.out.println(word);
	}
}
