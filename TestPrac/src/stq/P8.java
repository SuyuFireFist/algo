package stq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int pri;
	public Person(int id,int pri) {
		this.id=id;
		this.pri=pri;
	}
}

public class P8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Queue<Person> q = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			q.offer(new Person(i,arr[i]));
		}
		
		int answer=0;
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x : q) {
				if(x.pri>tmp.pri) {
					q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) break;
			}
		}
		System.out.println(answer);
	}
}
