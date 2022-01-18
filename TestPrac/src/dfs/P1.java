package dfs;

import java.util.Scanner;

public class P1 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			System.out.println(n);
			DFS(n-1);
		}
	}

	public static void main(String[] args) {
		P1 T = new P1();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		T.DFS(a);
	}

}
