package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol5567 {

	public static int[] arr;
	public static boolean[] visit;
	public static int N;
	public static int answer;
	public class Point{
		int x;
		int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}

	}

	public void sol() {
		N = 6;
		answer = 0;
		visit = new boolean[N+1];
		List<Point> list = List.of(
			new Point(2,3),
			new Point(3,4),
			new Point(4,5),
			new Point(5,6),
			new Point(4,5)
			);


		for (int i = 0 ; i < list.size() ; i++){
			dfs(list.get(i).x,list.get(i).y, 0,list);
		}

		System.out.println(answer);

	}

	public  void dfs(int dx, int dy, int depth,List<Point> list) {

		if (depth == 2){
			return;
		}

		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(dx,dy));
		visit[dx] = true;

		while(!queue.isEmpty()){

			Point point = queue.poll();

			for (Point nextPoint : list){
				if (point.y == nextPoint.x && visit[nextPoint.x] == false){
					visit[nextPoint.x]=true;
					answer++;
					queue.offer(nextPoint);

				}
			}


		}


	}
}
