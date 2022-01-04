package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Sol1463 {

	public static int min;

	public static class Point {
		int x;
		int count;

		public Point(int x, int count) {
			this.x = x;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Point{" +
				"x=" + x +
				", count=" + count +
				'}';
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		min = Integer.MAX_VALUE;

		dfs(num,0);

		System.out.println(min);

	}

	public static void dfs(int num, int depth){

		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(num,0));

		while(!queue.isEmpty()){


			Point p = queue.poll();

			if (p.x == 1){
				min = p.count;
				break;
			}

			if (num < 1){
				break;
			}

			if (num % 3 == 0){
				queue.offer(new Point(p.x/3, p.count+1));
			}

			if (num % 2 == 0){
				queue.offer(new Point(p.x/2, p.count+1));
			}

			queue.offer(new Point(p.x -1, p.count+1));


		}



	}


}


/*public class Sol1463 {

	public static int min;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		min = Integer.MAX_VALUE;

		dfs(num,0);

		System.out.println(min);

	}

	public static void dfs(int num, int depth){


		if (num == 1){
			min = Math.min(min,depth);
			return;
		}

		if (num < 1){
			return;
		}

		if (num % 3 == 0){
			dfs(num/3,depth+1);
		}

		if (num % 2 == 0){
			dfs(num/2,depth+1);
		}

		dfs(num-1,depth+1);

	}


}*/


