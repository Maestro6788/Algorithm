package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol2667Re {

	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static int answer;


	public void sol() {
		answer = 0;
		arr = new int[][]{
			{0,1,1,0,1,0,0},
			{0,1,1,0,1,0,1},
			{1,1,1,0,1,0,1},
			{0,0,0,0,1,1,1},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0},
			{0,1,1,1,0,0,0}
		};
		visit = new boolean[arr.length][arr[0].length];
		int depth = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0 ; i < arr.length ; i++){
			for (int j =0 ; j < arr[0].length; j++){

				if (arr[i][j] == 1 && visit[i][j] == false){
					depth = dfs(i,j,0);
					answer++;
					list.add(depth);
				}


			}
		}
		System.out.println(answer);
		System.out.println(list);


	}

	public  int dfs(int tx, int ty, int depth) {
		visit[tx][ty] = true;

		for (int i = 0 ; i < 4 ; i++){
			int nx = tx + dx[i];
			int ny = ty + dy[i];

			if (nx >=0&& ny >=0 && nx<arr.length && ny<arr[0].length ){
				if (visit[nx][ny] == false && arr[nx][ny] == 1){
					depth = dfs(nx,ny,depth+1);

				}

			}


		}
		return  depth;

	}
}
