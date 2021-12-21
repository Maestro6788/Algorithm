package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol6603 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0)
				break;

			int[] arr = new int[n];
			boolean[] visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			dfs(arr, visited, 0, 6, 0);
			System.out.println();

		}
	}

	public static void dfs(int[] arr, boolean[] visited, int depth, int size, int idx) {

		if (size == depth) {

			for (int i = 0; i < visited.length; i++) {

				if (visited[i] == true) {
					System.out.print(arr[i] + " ");

				}

			}
			System.out.println();
		}

		for (int i = idx; i < arr.length; i++) {
			if (visited[i] == false) {

				visited[i] = true;
				dfs(arr, visited, depth + 1, size, i);
				visited[i] = false;

			}

		}

	}

}
