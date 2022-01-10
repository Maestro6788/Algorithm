package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 치킨거리 https://www.acmicpc.net/problem/15686
public class Sol15686 {

	public static class Info {
		int x;
		int y;

		public Info(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static List<Info> chickenList;
	public static List<Info> houseList;
	public static List<Integer> list;

	public static boolean[] visit;
	public static int size;
	public static int requested;
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		chickenList = new ArrayList<>();
		houseList = new ArrayList<>();
		list = new ArrayList<>();

		size = Integer.parseInt(st.nextToken());
		requested = Integer.parseInt(st.nextToken());

		for (int i = 0; i < size; i++) {

			StringTokenizer st1 = new StringTokenizer(br.readLine());

			for (int j = 0; j < size; j++) {
				int n = Integer.parseInt(st1.nextToken());

				if (n == 1) {
					houseList.add(new Info(j, i));
				}
				if (n == 2) {
					chickenList.add(new Info(j, i));
				}

			}

		}

		visit = new boolean[chickenList.size()];

		dfs(0,0);

		System.out.println(min);

	}

	public static void dfs(int depth,int idx) {

		if (depth == requested) {

			int sum = 0;
			for (int i = 0; i < houseList.size(); i++) {
				Info hou = houseList.get(i);

				int distance = Integer.MAX_VALUE;
				for (int j = 0; j < list.size(); j++) {
					Info chi = chickenList.get(list.get(j));
					distance = Math.min(distance, Math.abs(chi.x - hou.x) + Math.abs(chi.y - hou.y));

				}
				sum += distance;
			}
			min = Math.min(sum, min);

			return;
		}

		for (int i = idx; i < chickenList.size(); i++) {

			if (visit[i] == false) {

				visit[i] = true;
				list.add(i);
				dfs(depth + 1, i+1);
				list.remove(depth);
				visit[i] = false;

			}

		}

	}

}
