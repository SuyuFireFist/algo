package lev1;

import java.util.Arrays;

public class PlusNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4,5,6,7,8,9};int sum=0;
		/*
		int[] numbers = {4,5,6,7,8,9};
		int max=45;
		for( int nonum : numbers) {
			max-=nonum;
		}
		System.out.println(max);
		*/
		int[] map = new int[10];
		
		for(int v : numbers) {
			map[v]=v;
			sum+=v;
		}
		

		
		
		System.out.println(45-sum);
		
	}
	
}

/*
class Solution {
    public int solution(int[] numbers) {
    	var map = new int[10];
    	
		for(int v : numbers) map[v]=1;
		
		int sun
		return 0;
    }
}
*/