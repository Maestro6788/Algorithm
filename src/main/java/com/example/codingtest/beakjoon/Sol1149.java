package com.example.codingtest.beakjoon;

public class Sol1149 {

	/**
	 * todo. 미해결. 동적프로그래밍 다시 이해
	 */

	public static int[][] arr;
	public static boolean[] visit;
	public static int N = 3;

	public void sol() {
		arr = new int[][]{{26,40,83},{49,60,57},{13,89,99}};

		for (int i = 0; i < 3 ; i++){
			dfs(i,1,arr[0][i]);
		}



	}

	public static void dfs(int index, int depth, int sum) {
		if (depth == 3){

			return;
		}

		if (depth==2){
			visit[index] = false;
		}

		for (int i = 0 ; i < 3 ; i++){

			if (!visit[i]){
				visit[i] = true;

				sum += arr[depth][i];

				dfs(index,depth+1,sum);

			}
		}







	}
}
