package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2630 {

	public static int[][] arr;
	public static boolean[][] visit;
	public static int size;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static boolean flag;
	public static int count;



	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		size = n;
		arr = new int[n][n];


		for (int i = 0 ; i < n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0 ; j < n ; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while(n > 0){


			cycle(n , 0);
			n /= 2;



		}



	}

	public static void cycle(int n , int depth){

		for (int startX = 0 ; startX < size ; startX += n ){
			for (int startY = 0 ; startY < size ; startY += n){
				visit = new boolean[size][size];

				for (int i = startX ; i < startX+n ; i++){
					for (int j = startY ; j < startY+n ; j++){
						if (visit[i][j] == false){
							flag = false;
							dfs(i,j,arr[i][j],n);

							if (flag == false){
								count++;
							}

						}
					}
				}

			}
		}

	}

	public static void dfs(int x, int y, int index, int arrSize){
		// index 1,0 둘중하나로 입력됨

		for (int i = 0 ; i < 4 ; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx>= 0 && ny >= 0 && nx<arrSize && ny<arrSize){

				if (visit[nx][ny] == false){
					if (index != arr[nx][ny]){
						flag = true;
						return;
					}
					// 1이 아니면 중단 시킬수 있도록 코드를 작성
					dfs(nx,ny,index,arrSize);

				}
			}
		}
	}

}
