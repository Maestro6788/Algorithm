package com.example.codingtest.beakjoon;

import java.util.LinkedList;
import java.util.Queue;

public class Sol2178 {

	public static int[][] arr;
	public static int[][] visit;
	public static int min;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};

	public static class Location{
		int x;
		int y;

		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Location{" +
				"x=" + x +
				", y=" + y +
				'}';
		}
	}
	public void sol() {

		arr = new int[][]{{1,0,1,1,1,1},{1,0,1,0,1,0},{1,0,1,0,1,1},{1,1,1,0,1,1}};
		visit = new int[arr.length][arr[0].length];

		dfs();

		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[0].length ; j++){
				//System.out.println(visit[i][j]);
			}
		}

		//System.out.println(count);
	}

	public static void dfs() {
		Queue<Location> q = new LinkedList<>();

		q.offer(new Location(0,0));
		visit[0][0] = 1;



		while(!q.isEmpty()){

			Location location = q.poll();
			int x = location.x;
			int y = location.y;

			System.out.println(x + " " + y + " " + visit[x][y]);
			//System.out.println(x + " " + y);

			for (int i = 0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >=0 && ny >=0 && nx < arr.length && ny < arr[0].length){
					if (visit[nx][ny] == 0 && arr[nx][ny] == 1){
						q.offer(new Location(nx, ny));
						visit[nx][ny] += visit[x][y]+1;
					}
				}
			}

		}

		System.out.println(visit[3][5]);

	}
}
