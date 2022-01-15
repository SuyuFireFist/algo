package string;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		String rev="";
		rev=new StringBuilder(input).reverse().toString();

		String a = input.toLowerCase();
		String b = rev.toLowerCase();
		
		if(a.equals(b))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
