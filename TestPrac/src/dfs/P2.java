package dfs;

import java.util.Scanner;

public class P2 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}

	public static void main(String[] args) {
		P2 T = new P2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.DFS(n);
	}
}
