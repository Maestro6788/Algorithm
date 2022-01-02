package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol16953 {

	public static long endNum;
	public static long Max;
	public static boolean flag;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long startNum = Integer.parseInt(st.nextToken());
		endNum = Integer.parseInt(st.nextToken());
		Max = Integer.MAX_VALUE;

		dfs(startNum, 1);

		if (flag == false) {
			Max = -1;
		}

		System.out.println(Max);

	}

	public static void dfs(long num, int depth) {

		if (num == endNum) {
			Max = Math.min(Max, depth);
			flag = true;
			return;
		}

		if (num > endNum) {
			return;
		}

		dfs(num * 2, depth + 1);
		dfs(num * 10 + 1, depth + 1);

	}

}
