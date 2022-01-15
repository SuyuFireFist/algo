package stq;

import java.util.Scanner;
import java.util.Stack;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		int rs=0;
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push('(');
			}else {
				stack.pop();
				if(s.charAt(i-1)=='(') {
					rs+=stack.size();
				}else rs++;
			}
		}
		System.out.println(rs);
	}

}
