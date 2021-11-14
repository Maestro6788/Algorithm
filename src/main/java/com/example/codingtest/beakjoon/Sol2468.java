package com.example.codingtest.beakjoon;

public class Sol2468 {

	/**
	 * todo. 미완성 생각보다 쉬움, 복잡하게 생각하지 말고 단순하게 밀고가자
	 */

	public static int[][] arr;
	//public static boolean[][] visit;
	public static int N = 5;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};

	public void sol() {

		arr = new int[][] {{6, 8, 2, 6, 2}, {3, 2, 3, 4, 6}, {6, 7, 3, 3, 2}, {7, 2, 5, 3, 6}, {8, 9, 5, 2, 7}};
		//visit = new boolean[N][N];
		int min = 100;
		int max = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				min = Math.min(min, arr[i][j]);
				max = Math.max(max, arr[i][j]);
			}
		}


		for (int i = min ; i < max ; i++){
			boolean[][] visit = new boolean[N][N];
			boolean[][] check = new boolean[N][N];
			dfs(i,0, visit, check);
		}


	}

	public static void dfs(int index, int depth,boolean[][] visit,boolean[][] check) {


		if (depth == 0){
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (index >= arr[i][j]){
						visit[i][j] = true;
					}
				}
			}
		}

		/*for (int i = 0 ; i < 4 ; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >=0 && ny >=0 && nx < N && ny < N){
				if ( 조건문 false ){
					dfs
				}
			}

		}*/



	}
}
