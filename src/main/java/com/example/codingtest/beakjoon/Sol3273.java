package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sol3273 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		int end = N - 1;
		Arrays.sort(arr);
		int count = 0;

		for (int i = 0; i < str.length - 1; i++) {

			for (int j = 0; j < end; j++) {

				if (arr[j] + arr[end] == M) {
					count++;

					break;
				}

			}
			end--;

		}

		System.out.println(count);

	}

}
