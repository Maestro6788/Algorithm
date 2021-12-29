package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sol1018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());


		int result = Integer.MAX_VALUE;

		char[][] arr = new char[y][x];

		for (int i = 0; i < y; i++) {
			String str = br.readLine();
			for (int j = 0; j < x; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for (int yarr = 0; yarr <= y - 8; yarr++) {

			for (int xarr = 0; xarr <= x - 8; xarr++) {


				int count1 = 0;
				int count2 = 0;

				for (int i = 0; i < 8; i++) {

					for (int j = 0; j < 8; j++) {

						if (i % 2 == 0) {
							if (j % 2 == 0) {
								if (arr[yarr+i][xarr+j] != 'W') {
									count1++;
								}
								if (arr[yarr+i][xarr+j] != 'B') {
									count2++;
								}
							}

							if (j % 2 == 1) {
								if (arr[yarr+i][xarr+j] != 'B') {
									count1++;
								}
								if (arr[yarr+i][xarr+j] != 'W') {
									count2++;
								}
							}

						}

						if (i % 2 == 1) {
							if (j % 2 == 0) {
								if (arr[yarr+i][xarr+j] != 'W') {
									count2++;
								}
								if (arr[yarr+i][xarr+j] != 'B') {
									count1++;
								}
							}

							if (j % 2 == 1) {
								if (arr[yarr+i][xarr+j] != 'B') {
									count2++;
								}
								if (arr[yarr+i][xarr+j] != 'W') {
									count1++;
								}
							}

						}

					}

				}

				int min = Math.min(64 - count1, 64 - count2);

				result = Math.min(result,min);

			}

		}

		System.out.println(result);

	}

}
