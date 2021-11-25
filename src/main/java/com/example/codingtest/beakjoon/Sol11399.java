package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol11399 {

	public static int[] arr;
	public static boolean[] visit;

	public class Point implements Comparable<Point> {
		int x;
		int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}


		@Override
		public int compareTo(Point p){

			if ( this.y >= p.y){
				return 1;
			}

			return -1;
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

		int[] a = new int[]{3, 1, 4, 3, 2};
		List<Point> list = new ArrayList<>();


		for (int i = 0 ; i < a.length ; i++){
			list.add(new Point(i,a[i]));
		}

		Collections.sort(list);

		System.out.println(list);


	}

	public  void dfs(int N, int M, int depth) {

	}
}
