package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Sol2667Re {

	public static int N;
	public static int[][] map;
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int aptCount;
	public static List<Integer> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (map[i][j] == 1) {
					count++;
					aptCount = 0;
					list.add(dfsHere(i, j, 0));
				}
			}
		}

		System.out.println(count);
		Collections.sort(list);
		for (int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i)+1);
		}

	}

	public static int dfsHere(int x, int y, int depth) {

		map[x][y] = 0;




		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];



			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {

				if (map[nx][ny] == 1) {
					depth = dfsHere(nx, ny, depth + 1);
				}
			}

		}

		return depth;
	}

}
