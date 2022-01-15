package string;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input = sc.nextLine();
		String rs = input.toUpperCase().replaceAll("[^A-Z]", "");
		
		if(rs.equals(new StringBuilder(rs).reverse().toString()))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
