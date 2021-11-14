package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol16236 {

	public static int[][] arr;
	public static int[][] visit;
	public static int N;
	public static List<Point> feed;
	public static List<Point> shark;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};
	public static int SharkSize;
	public static int FeedCount;
	public static int Count;

	public class Point{
		int x;
		int y;


		public Point(int x, int y){
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

		N = 6;
		SharkSize = 2;
		FeedCount = 0;
		Count = 0;
		feed = new ArrayList<>();
		shark = new ArrayList<>();
		arr = new int[][]{
			{5, 4, 3, 2, 3, 4},
			{4, 3, 2, 3, 4, 5},
			{3 ,2, 9, 5,6, 6},
			{2, 1, 2, 3, 4, 5},
			{3, 2 ,1 ,6 ,5 ,4},
			{6, 6, 6, 6, 6, 6}
		};

		visit = new int[arr.length][arr.length];

		for (int i = 0 ; i < N ; i++){
			for (int j = 0 ; j < N ; j++){
				if (arr[i][j] == 9){
					shark.add(new Point(i,j));
				}
				else if(arr[i][j] != 0){
					feed.add(new Point(i,j));
				}
			}
		}

		System.out.println(feed);

		dfs();

		System.out.println(Count);

	}

	public void dfs() {

		Queue<Point> queue = new LinkedList<>();

		for (Point p : shark){
			queue.offer(new Point(p.x,p.y));
			visit[p.x][p.y] = 1;
		}

		while(!queue.isEmpty()){

			Point p = queue.poll();

			int x = p.x;
			int y = p.y;

			for (int index = 0 ; index < feed.size() ; index++){
				Point feedPoint = feed.get(index);


				if(arr[feedPoint.x][feedPoint.y] < SharkSize && x == feedPoint.x&& y == feedPoint.y ){
					FeedCount++;
					Count = Count + (visit[feedPoint.x][feedPoint.y]);

					feed.remove(index);
					arr[feedPoint.x][feedPoint.y] = 0;

					System.out.println(Count);


					for (int i = 0 ; i < N ; i++){
						for (int j = 0 ; j < N ; j++){
							visit[i][j] = 0;
						}
					}

					// for (int i = 0 ; i < queue.size() ; i++) {
					// 	queue.poll();
					// 	System.out.println("---------");
					// 	System.out.println(queue);
					// 	System.out.println("---------");
					//
					// }

					queue.clear();
					queue.offer(feedPoint);

					if (FeedCount == SharkSize){
						SharkSize++;
						FeedCount = 0;
					}

				}
			}

			if (feed.size() ==0){
				break;
			}


			for (int i = 0 ; i < 4 ; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >=0 && ny >=0 && nx < N && ny <N){
					if (visit[nx][ny] == 0){
						queue.offer(new Point(nx,ny));
						visit[nx][ny] = visit[x][y] +1;
					}
				}


			}



		}

	}
}
