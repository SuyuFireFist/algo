package string;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String rs="";
		
		for(int i=0;i<input.length();i++) {
			if(input.indexOf(input.charAt(i))==i)
				rs+=input.charAt(i);
		}
		System.out.println(rs);
	}

}
