package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] words = new String[num];
		
		for(int i=0;i<words.length;i++) {
			words[i]=sc.next();
		}
		
		for(int i=0;i<words.length;i++) {
			String rs = new StringBuilder(words[i]).reverse().toString();
			System.out.println(rs);
		}
	}

}
