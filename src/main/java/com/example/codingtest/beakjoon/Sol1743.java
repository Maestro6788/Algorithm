package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1743 {

	public static int row; //가로
	public static int col; //세로
	public static int num; //갯수
	public static int[][] arr;
	public static boolean[][] map;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		num = Integer.parseInt(st.nextToken());

		arr = new int[col][row];
		map = new boolean[col][row];


		for (int i = 0 ; i < num ; i++){
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st1.nextToken())-1;
			int x = Integer.parseInt(st1.nextToken())-1;
			arr[y][x] = 1;
		}

		int num = 0;
		int max = 0;
		for (int i = 0 ; i < col ; i++){
			for (int j = 0; j < row ; j++){

				if (map[i][j] == false && arr[i][j] == 1){
					num = dfs(j,i,0);
					max = Math.max(num,max);
				}

			}
		}

		System.out.println(max);

	}

	public static int dfs(int x, int y , int depth){


		for (int i = 0 ; i < 4 ; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx <row && ny < col){

				if (map[ny][nx] == false && arr[ny][nx] == 1){

					map[ny][nx] = true;
					depth = dfs(nx,ny,depth+1);

				}

			}


		}

		return depth;
	}


}
