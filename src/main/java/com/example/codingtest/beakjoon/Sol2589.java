package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol2589 {

	public class Point{
		int x;
		int y;

		public Point(int x, int y){
			this.x =x;
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

	public static List<Point> phone;
	public static List<Point> rook;
	public static int sx ;
	public static int sy ;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};


	public static int[][] visit;

	public void sol() {
		sx= 6;
		sy= 6;

		phone = new ArrayList<>();
		rook = new ArrayList<>();

		phone.add(new Point(1,3));
		phone.add(new Point(4,1));

		rook.add(new Point(2,1));
		rook.add(new Point(3,3));
		rook.add(new Point(4,4));


		visit = new int[sx][sy];


		dfs(0);

		for (int i = 0 ; i < sx ; i++){
			for (int j = 0 ; j < sy ; j++){

				System.out.print(visit[i][j]);

			}
			System.out.println();
		}

		int max = 0;
		for (int index = 0 ; index < rook.size() ; index++){
			int tmp = visit[rook.get(index).x][rook.get(index).y];

			max = Math.max(max,tmp);

		}
		System.out.println(max);





	}

	public void dfs(int depth) {

		Queue<Point> q = new LinkedList<>();

		if (depth == 0){
			for (Point p : phone){
				q.offer(p);
				visit[p.x][p.y] = 1;
			}


			for (int i = 0 ; i < sx ; i++){
				for (int j = 0 ; j < sy ; j++){

					System.out.print(visit[i][j]);

				}
				System.out.println();
			}
		}

		while(!q.isEmpty()){

			Point p = q.poll();


			int x = p.x;
			int y = p.y;


			for (int i = 0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny >= 0 && nx <sx && ny <sy){
					if (visit[nx][ny] == 0){

						q.offer(new Point(nx,ny));
						visit[nx][ny] = visit[x][y] + 1;
					}

				}

			}
		}


	}
}
