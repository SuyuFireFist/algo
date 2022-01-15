package lev1;

import java.util.Arrays;

public class IncomFinish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ao=0;
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};

		/*
		 * int c=0;
		String ans="";
		Arrays.sort(a);
		Arrays.sort(b);

		for(int i=0;i<b.length;i++) {
			c=Arrays.binarySearch(a, b[i]);
			if(c<0) {
				ans = b[i];
			}
		}
		System.out.println(ans);
		*/
		Solution find = new Solution();
		System.out.println(find.solution(participant, completion));
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
	}

}
/*
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";  
        int i=0;  
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(i=0;i<completion.length;i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        answer = participant[i];
        return answer;
    }
}
*/