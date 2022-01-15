package lev1;

import java.util.Arrays;

public class P12950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] fir = { { 1 }, { 2 } };
		int[][] sec = { { 3 }, { 4 } };
		int[][] rs = new int[fir.length][fir[0].length];

		for (int i = 0; i < rs.length; i++) {
			for (int j = 0; j < rs[0].length; j++) {
				rs[i][j] = fir[i][j] + sec[i][j];
				System.out.println(rs[i][j]);
			}
		}
		Solution test = new Solution();
		System.out.println(test.solution(fir, sec));

	}

}

class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}