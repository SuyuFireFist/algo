package lev1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Bak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int con=42;
		int cnt=1;
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[10];
		
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt()%con;
		}
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		for(int i=0;i<number.length;i++) {
			for(int j=i+1; j<number.length; j++ ) {
				if(number[i]!=number[j]) {
					cnt++;
					break;
				}else if(number[i]==number[j]){
					break;
				}
			}
		}
		
		System.out.println("°³¼ö : "+cnt);
	}

}
