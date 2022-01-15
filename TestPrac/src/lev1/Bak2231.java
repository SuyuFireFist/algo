package lev1;

import java.util.Scanner;

public class Bak2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int rs = 0;
		
		for(int i=0;i<N;i++) {
			int num = i;
			int sum = 0;
			
			while(num!=0) {
				sum+=num%10;
				num=num/10;
			}
			
			if(sum+i==N) {
				rs = i;
				break;
			}
		}
		System.out.println(rs);
	}
}
