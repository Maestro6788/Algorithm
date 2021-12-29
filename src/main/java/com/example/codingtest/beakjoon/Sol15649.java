package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol15649 {

	public static int size;
	public static int line;
	public static boolean[] arr;
	public static List<Integer> list;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		size = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());

		arr = new boolean[size];
		list = new ArrayList<>();
		dfs(0);

	}

	public static void dfs(int depth) {

		if (depth == line) {

			StringBuilder sb = new StringBuilder();
			for (int n : list){
				sb.append(n).append(' ');
			}
			System.out.println(sb.toString());
			return;
		}

		for (int i = 0; i < size; i++) {

			if (arr[i] == false) {

				arr[i] = true;
				list.add(i + 1);
				dfs(depth + 1);
				list.remove(depth);
				arr[i] = false;

			}

		}

	}

}
