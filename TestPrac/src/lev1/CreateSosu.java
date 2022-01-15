package lev1;

import java.util.Arrays;
import java.util.Collections;

public class CreateSosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=11525;
		String str=Long.toString(a);
		Integer[] arr = new Integer[str.length()];
		
		for(int i=0;i<str.length();i++){
            arr[i]=(int) str.charAt(i)-48;
        }
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }
		System.out.println("");
		
		Long b=Long.parseLong(str);
		
		System.out.println(b);
		
		Solution abc = new Solution();
		System.out.println(abc.solution(255));
	}

}

/*
class Solution {
    public long solution(long n) {
        
    	long answer=0;
        
        String str=Long.toString(n);
        Integer[] arr = new Integer[str.length()];
        
        for(int i=0;i<str.length();i++){
            arr[i]=(int) str.charAt(i)-48;
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
       
        for (int i = 0; i < arr.length; i++) {
        	answer+=arr[i]*Math.pow(10, arr.length-1-i);
        }
        
        return answer;
    }
}
*/