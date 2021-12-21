package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol2178 {


	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int[][] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int[][] arr = new int[x][y];

		for (int i = 0; i < x; i++) {
			String s = br.readLine();
			for (int j = 0; j < y; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		visit = new int[arr.length][arr[0].length];

		bfs(0, 0,arr);

		System.out.println(visit[x-1][y-1]);

	}

	public static void bfs(int x, int y,int[][] arr){


		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{x,y});
		visit[x][y] =1;

		while(!queue.isEmpty()){

			int[] now = queue.poll();
			int nowX = now[0];
			int nowY = now[1];


			for (int i = 0 ; i< 4 ;i++){

				int nx = nowX + dx[i];
				int ny = nowY + dy[i];

				if ( nx >= 0 && ny >=0 && nx <arr.length && ny < arr[0].length){
					if (visit[nx][ny] == 0 && arr[nx][ny]==1){
						queue.offer(new int[]{nx,ny});
						visit[nx][ny] = visit[nowX][nowY] +1;
					}

				}


			}


		}



	}


}
