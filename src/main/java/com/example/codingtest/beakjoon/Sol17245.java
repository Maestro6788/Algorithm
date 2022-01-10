package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol17245 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];
		int sum = 0;
		int max = 0;

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				sum += arr[i][j];
				max = Math.max(max, arr[i][j]);
			}
		}



		int high = max;
		int low = 0;

		while (low + 1 < high) {

			int mid = (low + high) / 2;
			int count = 0;

			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {

					if (arr[i][j] > mid) {
						count += mid;
					}
					if (arr[i][j] <= mid) {
						count += arr[i][j];
					}

				}
			}

			if ((double)count/sum < 0.5) {
				low = mid;
			} else {
				high = mid;
			}

		}

		System.out.println(high);

	}

}
