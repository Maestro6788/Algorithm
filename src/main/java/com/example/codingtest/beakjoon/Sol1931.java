package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sol1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];

		for (int i = 0 ; i < num ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}

				return o1[1] - o2[1];
			}

		});

		int answer = 1;
		int end = arr[0][1];
		for (int i = 1 ; i < num ; i++){

			if (arr[i][0] >= end ){
				answer++;
				end = arr[i][1];
			}

		}

		System.out.println(answer);


	}


}
