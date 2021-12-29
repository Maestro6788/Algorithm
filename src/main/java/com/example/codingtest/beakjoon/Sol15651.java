package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol15651 {

	public static int size;
	public static int line;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		size = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());

		arr = new int[line];
		dfs(0);
		System.out.println(sb);

	}

	public static void dfs(int depth) {

		if (depth == line) {

			for (int i = 0; i < line; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < size; i++) {

			arr[depth] = i+1;
			dfs(depth + 1);

		}

	}

}
