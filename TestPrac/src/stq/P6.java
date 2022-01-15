package stq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int rs =0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i=1;i<k;i++) {
				queue.offer(queue.poll());
			}
			queue.poll();
			if(queue.size()==1) {
				rs = queue.poll();
			}
		}
		System.out.println(rs);
	}
}
