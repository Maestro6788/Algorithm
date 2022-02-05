package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2630 {

	public static int white = 0;
	public static int black = 0;
	public static int[][] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new int[num][num];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(num, 0, 0);

		System.out.println(white);
		System.out.println(black);

	}

	// index 1,2,3,4 사분면
	// n 가로 세로 크기
	public static void dfs(int n, int x, int y) {

		int one = 0;
		int zero = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (arr[x + i][y + j] == 1) {
					one++;
				}
				if (arr[x + i][y + j] == 0) {
					zero++;
				}

			}

		}

		if (one == 0 || zero == 0) {

			if (one == 0) {
				white++;
			}
			if (zero == 0) {
				black++;
			}

			return;
		}

		dfs(n / 2, x, y);
		dfs(n / 2, x + n / 2, y);
		dfs(n / 2, x, y + n / 2);
		dfs(n / 2, x + n / 2, y + n / 2);

	}

}
