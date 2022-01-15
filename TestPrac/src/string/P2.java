package string;

import java.util.Arrays;
import java.util.Scanner;


// 97 => a
// 65 => A
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		char[] arr = input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
			if(arr[i]>=97&&arr[i]<=129) {
				arr[i]-=32;
			}
			else {
				arr[i]+=32;
			}
		}
		
		System.out.println(arr);
	}
}
