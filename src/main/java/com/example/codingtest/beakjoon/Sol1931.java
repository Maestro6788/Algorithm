package com.example.codingtest.beakjoon;

import java.util.Arrays;
import java.util.Comparator;

public class Sol1931 {

	public static int[] arr;
	public static boolean[] visit;

	public void sol() {
		int N = 11;
		int[][] arr = new int[][] {
			{1, 4},
			{3, 5},
			{0, 6},
			{5, 7},
			{3, 8},
			{5, 9},
			{6, 10},
			{8, 11},
			{8, 12},
			{2, 13},
			{12, 14}
		};

		Arrays.sort(arr,new Comparator<int[]>(){

			public int compare(int[] o1, int[] o2){
				if (o1[1] == o2[1]){
					return o1[0] - o2[0];
				}


				return o1[1] - o2[1];


			}

		});

		int start = 0 ;
		int end = 0;
		int count = 0;
		for (int i = 0 ; i < arr.length ;i++){


			if (arr[i][0] >= end){
				start = arr[i][0];
				end = arr[i][1];
				count++;
			}


		}
		System.out.println(count);



	}

	public void dfs(int N, int M, int depth) {

	}
}
