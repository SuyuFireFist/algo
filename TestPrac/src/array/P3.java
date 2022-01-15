package array;

import java.util.Arrays;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String rs = "";
		
		int[][] arr = new int[2][cnt];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<cnt;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<cnt;i++) {
			if(arr[0][i]==arr[1][i]) rs+="D";
			else if(arr[0][i] == 1 && arr[1][i]==3) rs+="A";
			else if(arr[0][i] == 2 && arr[1][i]==1) rs+="A";
			else if(arr[0][i] == 3 && arr[1][i]==2) rs+="A";
			else {
				rs+="B";
			}
		}
		for(char x : rs.toCharArray()) {
			System.out.println(x);
		}
		
	}

}
