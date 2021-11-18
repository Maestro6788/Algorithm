package com.example.codingtest.beakjoon;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Sol2606Re {

	public static int[] arr;
	public static boolean[] visit;
	public static int ComputerNum;
	public static int LinkedNum;

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
		ComputerNum = 7;
		LinkedNum = 6;
		visit = new boolean[7];
		List<Point> list = List.of(
			new Point(1,2),
			new Point(2,3),
			new Point(1,5),
			new Point(5,2),
			new Point(5,6),
			new Point(4,7)
		);

		for(int i = 0 ; i < list.size() ; i++){
			if (list.get(i).x == 1){
				dfs(list,list.get(i).x,list.get(i).y);

			}

		}

		int answer = 0;
		for (int i = 0 ; i < visit.length ; i++){
			System.out.println(visit[i]);
			if(visit[i] == true){
				answer++;
			}
		}

		System.out.println(answer);

	}

	public  void dfs(List<Point> list, int p1, int p2 ) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(p1,p2));
		visit[q.peek().x-1] = true;

		while(!q.isEmpty()){
			Point p = q.poll();
			System.out.println(p);

			for (Point point : list){
				if (p.y == point.x && visit[p.y-1] == false){
					visit[p.y-1] = true;
					visit[point.y-1] = true;

				}
			}

		}



	}
}
