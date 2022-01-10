package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2805 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		long size = Integer.parseInt(st.nextToken());
		long max = 0;
		long[] arr = new long[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
			max = Math.max(max, arr[i]);
		}

		long high = max;
		long low = 1;

		while (low <= high) {

			long mid = (low + high) / 2;
			long sum = 0;

			for (int i = 0; i < num; i++) {
				long n = arr[i] - mid;
				if (n >= 0) {
					sum += n;
				}
			}

			if (sum >= size) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		System.out.println(high);

	}

}
