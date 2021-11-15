package com.example.codingtest.beakjoon;

public class Sol2884 {

	public static int[] arr;
	public static boolean[] visit;


	public void sol() {
		int hour = 23;
		int min = 40;

		min -= 45;

		if (min < 0){
			min = 60 + min;

			hour--;
			if (hour < 0){
				hour = 23;
			}
		}

		System.out.println(hour);
		System.out.println(min);



	}

	public static void dfs(int N, int M, int depth) {

	}
}
