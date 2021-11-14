package com.example.codingtest.beakjoon;

public class Sol2606 {

	public static int[][] arr;
	public static boolean[] visit;
	public static int N = 7;
	public static int PAIR = 6;

	public void sol() {
		arr = new int [][]{{1,2},{2,3},{1,5},{5,2},{5,6},{4,7}};
		visit = new boolean[7];

		// for (int i = 0 ; i < N ; i++){
		// 	if (!visit[i]){
		// 		dfs(i);
		// 	}
		// }
		int count = 0;
		count = dfs(1, count);

		System.out.println(count);
	}

	public static int dfs(int index, int count) {
		visit[index] = true;

		for(int i =0; i < PAIR ; i++){
			if (arr[i][0] == index && visit[arr[i][1]]== false){
				count = dfs(arr[i][1], count +1 );
			}

		}

		return count;


	}
}
