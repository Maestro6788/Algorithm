package com.example.codingtest.beakjoon;

public class Sol2563 {

	// https://www.acmicpc.net/problem/2563
	// 구현

	public static int[][] arr;
	public static boolean[] visit;

	public void sol() {
		arr = new int[][]{{3,7},{15,7},{5,2}};
		int n= 3;
		int answer = 300;
		for (int i = 0; i < n ; i++ ){
			for (int j = i+1 ; j< n ; j++){

				int row = Math.abs(arr[i][0] - arr[j][0]);
				int col = Math.abs(arr[i][1] - arr[j][1]);

				if (row < 10 && col < 10 ){

					answer -= (10-row)*(10-col);
				}

			}
		}

		System.out.println(answer);


	}

	public static void dfs(int N, int M, int depth) {

	}
}
