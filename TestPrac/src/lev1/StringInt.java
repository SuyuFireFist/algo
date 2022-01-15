package lev1;

public class StringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-1234";
		int a =0,b=0;
		String c="";
		
		for(int i=0;i<s.length();i++) {
			c+=s.charAt(i);
		}
		System.out.println(s.charAt(0)+""+s.charAt(1)+""+s.charAt(2)+""+s.charAt(3));
		System.out.println(c.valueOf(c));
	}

}
/*
class Solution {
    public int solution(String s) {
       
        String rs="";
        
        for(int i=0;i<s.length();i++) {
			rs+=s.charAt(i);
		}
        
        int answer = Integer.parseInt(rs);
        return answer;
    }
}
*/