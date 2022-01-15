package c4;

import java.util.HashMap;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		
		HashMap<Character,Integer> hs1 = new HashMap<>();
		HashMap<Character,Integer> hs2 = new HashMap<>();
		
		int rs = 0;
		
		for(char x : s2.toCharArray()) {
			hs2.put(x, hs2.getOrDefault(x, 0)+1);
		}
		
		int L=s2.length()-1;
		
		for(int i=0;i<L;i++) {
			hs1.put(s.charAt(i), hs1.getOrDefault(s.charAt(i), 0)+1);
		}
		int lt=0;
		
		for(int rt=L;rt<s.length();rt++) {
			hs1.put(s.charAt(rt), hs1.getOrDefault(s.charAt(rt), 0)+1);
			if(hs1.equals(hs2)) rs++;
			hs1.put(s.charAt(lt), hs1.get(s.charAt(lt))-1);
			if(hs1.get(s.charAt(lt))==0) hs1.remove(s.charAt(lt));
			lt++;
			
		}
		
		System.out.println(rs);
	}

}
