package dfs;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
	int data;
	Node lt,rt;
	public Node2(int val) {
		data=val;
		lt=rt=null;
	}
}


public class P7 {
	Node root;
	public void DFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L=0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L+" : ");
			for(int i=0;i<len;i++) {
				Node cur=Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) Q.add(cur.lt);
				if(cur.rt!=null) Q.add(cur.rt);
			}
			L++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P7 tree = new P7();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
