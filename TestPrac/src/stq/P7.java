package stq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String rs="";
		
		Queue<Character> q1 = new LinkedList<>();
		Queue<Character> q2 = new LinkedList<>();
		
		for(int i=0;i<s1.length();i++) {
			q1.offer(s1.charAt(i));
		}
		
		for(int i=0;i<s2.length();i++) {
			if(q1.contains(s2.charAt(i))) {
				q2.offer(s2.charAt(i));
			}
		}
		if(q1.equals(q2)) rs="YES";
		else rs = "NO";
		
		System.out.println(rs);
	}
}
