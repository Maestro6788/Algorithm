package com.example.codingtest.beakjoon;

import java.util.Scanner;

public class Sol15649 {

	public static int[] arr;
	public static boolean[] visit;

	public void sol() {



		int N = 4;
		int M = 4;

		arr = new int[M];   // 1차원 배열 크기 2짜리
		visit = new boolean[N];  // 방문체크 깊이 4
		dfs(N, M, 0);

	}

	public static void dfs(int N, int M, int depth) {
		// 깊이만큼 들어가면
		if (depth == M) {
			for (int val : arr) {
				//System.out.print(val + " ");
			}
			//System.out.println();
			return;
		}


		// 깊이가 4가 아니면
		// 여기서 1 2 / 1 3 / 1 4
		// 뒷부분이 결정
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;


				for (int j = 0 ; j < arr.length ; j++){
					System.out.print(arr[j]);
				}
				System.out.println();

				dfs(N, M, depth + 1);
				System.out.println("====");
				visit[i] = false;
			}

			System.out.println();
		}
	}
}
