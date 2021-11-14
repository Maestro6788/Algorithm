package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol7576 {

	public static int[][] arr;
	public static int[][] visit;
	public static int xSize =4;
	public static int ySize =6;
	public static int[] dx={1,-1,0,0};
	public static int[] dy={0,0,1,-1};

	public class Location{
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

		List<Location> list = new ArrayList<>();

		arr = new int[][]{
			{1, -1, 0, 0, 0, 0},
			{0 ,-1, 0, 0, 0, 0},
			{0 ,0 ,0 ,0 ,-1, 0},
			{0 ,0, 0, 0, -1 ,1}
		};

		visit = new int[xSize][ySize];

		for (int i = 0 ; i < xSize ; i++){
			for (int j = 0 ; j < ySize ; j++ ){
				if (arr[i][j] == 1){
					list.add(new Location(i,j));
				}

			}
		}

		dfs(list);

		int max = 0;
		for (int i = 0 ; i < xSize ; i++){
			for (int j = 0 ; j < ySize ; j++ ){
				System.out.print(visit[i][j]);
				max = Math.max(max,visit[i][j]);

			}
			System.out.println();
		}

		System.out.println(max);

	}

	public void dfs(List<Location> list) {
		Queue<Location> q = new LinkedList<>();

		for (Location location: list){
			q.offer(location);
			visit[location.x][location.y] = 1;
		}

		while(!q.isEmpty()){

			Location location = q.poll();
			int x = location.x;
			int y = location.y;

			for (int i =0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >=0 && ny >= 0 && nx < xSize && ny<ySize){
					if (visit[nx][ny] == 0 && arr[nx][ny]==0){
						q.offer(new Location(nx,ny));
						visit[nx][ny] = visit[x][y] +1;
					}

				}

			}


		}




	}
}
