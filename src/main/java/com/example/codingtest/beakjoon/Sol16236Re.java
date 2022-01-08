package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Sol16236Re {

	public static int[][] arr;
	public static int[][] visit;
	public static int N;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int size;
	public static int count;
	public static int answer;
	public class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
		}
	}

	public void sol() {

		arr = new int[][] {
			{4, 3, 2, 1},
			{0, 0, 0, 0},
			{0, 0, 9, 0},
			{1, 2, 3, 4}
		};
		N = arr.length;
		visit = new int[N][N];
		size = 2;
		count = 0;
		answer = 0;

		System.out.println("--------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 9) {
					dfs(i, j);
				}

			}
		}


		System.out.println(answer);

	}

	public void dfs(int tx, int ty) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(tx, ty));

		while (!q.isEmpty()) {

			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] < size && arr[i][j] != 0){
						flag = true;
						break;
					}

				}
				if (flag == true){
					break;
				}
			}

			if (flag == false){
				answer = visit[tx][ty];
				return;
			}

			Point p = q.poll();

			int x = p.x;
			int y = p.y;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N){
					// 상어 무게보다 작으면 먹는다.
					if (arr[nx][ny] < size && arr[nx][ny] != 0){
						count++;
						arr[nx][ny] = 0;
						q.clear();

						if (count == size){
							count = 0;
							size++;
						}

					}

					visit[nx][ny] = visit[x][y]+1;
					q.offer(new Point(nx,ny));
				}

			}

		}

	}
}
