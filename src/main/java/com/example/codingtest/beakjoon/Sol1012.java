package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1012 {


	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {



		String a = "dd";
		String b = String.valueOf(a.charAt(0));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());

		for (int caseIndex = 0; caseIndex < caseNum; caseIndex++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
			int num = Integer.parseInt(st.nextToken());

			for (int i = 0; i < num; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}

			boolean[][] visit = new boolean[arr.length][arr[0].length];

			int answer = 0;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (visit[i][j] == false && arr[i][j] == 1) {
						visit[i][j] = true;
						dfs(i, j, visit, arr);
						answer++;
					}
				}
			}

			System.out.println(answer);
		}

	}

	public static void dfs(int x, int y, boolean[][] visit, int[][] arr) {

		for (int i = 0; i < 4; i++) {

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {

				if (visit[nx][ny] == false && arr[nx][ny] == 1) {

					visit[nx][ny] = true;
					dfs(nx, ny, visit, arr);

				}

			}

		}

	}

}
