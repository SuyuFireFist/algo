package array;

import java.util.Arrays;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		String[] arr2 = new String[a];
		
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<a;i++) {
			arr2[i] = new StringBuffer(Integer.toString(arr[i])).reverse().toString();
			int toInt = Integer.parseInt(arr2[i]);
			
			if(isPrime(toInt)) {
				System.out.print(toInt+ " ");
			}
		}

		
	}
	
	public static boolean isPrime(int d) {
		if(d==1)
			return false;
		
		for(int i=2;i<d;i++) {
			if(d%i==0)
				return false;
		}
		
		return true;
	}

}
