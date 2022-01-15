package string;

import java.util.Arrays;
import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char t = sc.next().charAt(0);
		
		int[] rs = new int[s.length()];
		int P=1000;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				P=0;
				rs[i]=P;
			}else {
				P++;
				rs[i]=P;
			}
		}
		P=1000;
		for(int i=s.length()-1; i>=0 ; i--) {
			if(s.charAt(i)==t) {
				P=0;
			}else {
				P++;
				rs[i]=Math.min(P, rs[i]);
			}
		}
		for(int x : rs) {
			System.out.print(x+" ");
		}
	}
}
