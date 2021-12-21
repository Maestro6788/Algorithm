package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol7576 {

	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int[][] visit;
	public static int[][] arr;

	public static List<int[]> list;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		arr = new int[x][y];


		visit = new int[x][y];

		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < y; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		list = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 1){
					list.add(new int[]{i,j});
				}
			}
		}

		bfs();
		int max = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (visit[i][j] == 0 && arr[i][j] != -1){
					System.out.println(-1);
					return;
				}

				max = Math.max(max,visit[i][j]);


			}
		}

		System.out.println(max-1);
	}

	public static void bfs(){
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0 ; i < list.size() ; i++){
			queue.offer(list.get(i));
			visit[list.get(i)[0]][list.get(i)[1]] = 1;
		}

		while(!queue.isEmpty()){
			int[] point = queue.poll();
			int x = point[0];
			int y = point[1];

			for (int i = 0 ; i < 4 ; i++){

				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny>=0 && nx < arr.length && ny < arr[0].length){

					if (visit[nx][ny] == 0 && arr[nx][ny] == 0){

						queue.offer(new int[]{nx,ny});
						visit[nx][ny] = visit[x][y] +1;

					}


				}


			}




		}


	}


}
