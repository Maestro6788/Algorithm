package com.example.codingtest.beakjoon;

public class Sol14889 {
	//https://www.acmicpc.net/problem/14889
	//https://www.acmicpc.net/problem/16198

	public static int[][] arr;
	public static boolean[] visit;

	public static  int N = 4;
	public static  int SUM1;
	public static  int SUM2;
	public static  int ANSWER;



	public void sol() {
		arr = new int[][]{{0,1,2,3},{4,0,5,6},{7,1,0,2},{3,4,5,0}};
		visit = new boolean[N];

		dfs(0,0);

	}

	public static void dfs(int index, int depth) {

		System.out.println(index);
		if(depth == N/2){


			return ;
		}

		for(int i = index; i < N ; i++){
			if (visit[i] == false){
				visit[i] = true;


				dfs(i+1,depth+1);
				visit[i] = false;
			}

		}

		System.out.println();
	}
}
