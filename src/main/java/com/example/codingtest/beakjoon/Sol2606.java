package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol2606 {

	public static int[][] arr;
	public static boolean[] visit;
	public static int num;
	public static int total;
	public static int count;

	public static List<Point> list;

	public static class Point {
		int start;
		int end;

		public Point(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		total = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		visit = new boolean[num + 1];

		for (int i = 0; i < total; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			list.add(new Point(start, end));

		}

		System.out.println(count);

	}

	public static void bfs() {

		Queue<Point> queue = new LinkedList<>();

		visit[0] = true;
		visit[1] = true;

		queue.offer(new Point(1, 1));

		while (!queue.isEmpty()) {

			Point p = queue.poll();

			for (int i = 0; i < list.size(); i++) {

				if ( p.end == list.get(i).start) {
					queue.offer(new Point(list.get(i).start, list.get(i).end));

				}

				if (visit[list.get(i).start] == false && p.end == list.get(i).start) {
					count++;
				}

			}

		}

	}

}
