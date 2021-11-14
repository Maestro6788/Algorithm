package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol16198 {

	public static int[] arr;
	public static boolean[] visit;
	public static int N;
	public static int max;

	public static List<Integer> list;

	public void sol() {

		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		N = list.size();

		visit = new boolean[N];
		int sum = 0;
		dfs(sum);

		System.out.println("dd" + max);

	}

	public static void dfs( int sum) {
		if (list.size() <= 2){

			max = Math.max(max, sum);
			System.out.println(max);
			return;
		}

		for (int i = 1 ; i < list.size()-1 ; i++){
			int value = list.get(i);
			int num = list.get(i-1) * list.get(i+1);
			list.remove(i);

			dfs( sum+ num);
			list.add(i,value);
		}

	}
}
