package stq;

import java.util.Scanner;
import java.util.Stack;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Stack<Integer> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}else {
				int rt=stack.pop();
				int lt=stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		for(int x : stack) {
			System.out.println(x);
		}
	}
}
