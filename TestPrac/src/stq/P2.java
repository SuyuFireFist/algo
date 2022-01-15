package stq;

import java.util.Scanner;
import java.util.Stack;

public class P2 {
//	public String solution(String str){
//		String answer="";
//		Stack<Character> stack = new Stack<>();
//		
//		for(char x : str.toCharArray()) {
//			if(x==')') {
//				while(stack.pop()!='(');;
//			}else {
//				stack.push(x);
//			}
//		}
//		System.out.println(stack);
//		return answer;
//	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}else {
				stack.push(x);
			}
		}
		for(char y : stack) {
			System.out.print(y);
		}
	}
}
