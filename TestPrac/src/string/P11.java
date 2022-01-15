package string;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.next()+" ";
		String rs = "";
		int cnt=1;
		
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==input.charAt(i+1)) {
				cnt++;
			}else {
				rs+=input.charAt(i);
				if(cnt>1) rs+=String.valueOf(cnt);
				cnt=1;
			}
		}
		System.out.println(rs);
	}

}
