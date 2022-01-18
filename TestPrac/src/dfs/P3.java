package dfs;

import java.util.Scanner;

public class P3 {
	public int DFS(int n) {
		if(n==1) return 1;
		else {
			return n*DFS(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		P3 T = new P3();
		System.out.println(T.DFS(n));
		
	}
}
