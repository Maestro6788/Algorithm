package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol2667 {

	public static int[][] arr;
	public static boolean[][] visit;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};

	public void sol() {

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
		List<Integer> list = new ArrayList<>();

		int count = 0 ;
		for (int i = 0 ; i < arr.length ; i++){
			for (int j =0 ; j < arr[0].length ; j++){
				if (arr[i][j] == 1 && visit[i][j] == false){
					int value = 1;
					value = dfs(i,j, value);

					System.out.println(value);
					list.add(value);

					count++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(count);
		System.out.println(list);




	}

	public int dfs(int x, int y, int depth) {
		visit[x][y] = true;

		for (int i = 0 ; i < 4 ; i++){

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >=0 && ny >=0 && nx < arr.length && ny< arr[0].length){

				if (visit[nx][ny] == false && arr[nx][ny]==1){
					depth = dfs(nx,ny,depth+1);
				}
			}

		}

		return depth;

	}
}
