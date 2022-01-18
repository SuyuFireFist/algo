package dfs;

import java.util.Scanner;

public class P4 {
	public int DFS(int n) {
		if(n==1) return 1;
		else if(n==2) return 1;
		else {
			return DFS(n-2)+DFS(n-1);
		}
	}

	public static void main(String[] args) {
		P4 T = new P4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(T.DFS(i)+ " ");
		}
	}

}
