package lev1;

public class Bak2 {
	static int array[] = new int [10036];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10000;i++) {
			array[d(i)]=1;
			if(array[i]!=1) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public static int d(int number) {
		String a = ""+number;
		int rs=0;
		int num=0;
		
		
		for(int i=0;i<a.length();i++) {
			num=a.charAt(i)-48;
			rs+=num*Math.pow(10,a.length()-1-i);
			rs+=num;
		}
			
		return rs;
	}

}
