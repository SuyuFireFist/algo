package asd;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j;
		int key = sc.nextInt();
		
		System.out.println("key == "+key);
		
		for(i=key;i>=1;i--) {
			for(j=key;j>=i;j--) {
				System.out.print(i-j+key);
			}
			System.out.println();
		}
		
	}

}
