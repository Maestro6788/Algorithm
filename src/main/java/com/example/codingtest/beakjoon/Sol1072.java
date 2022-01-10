package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1072 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long all = Integer.parseInt(st.nextToken());
		long win = Integer.parseInt(st.nextToken());

		long high = all;
		long low = win;

		long per = win * 100 / all;
		if(per >= 99){
			System.out.println(-1);
			return;
		}

		while (low < high) {

			long mid = (high + low) / 2;
			long answer = mid * 100 / (all + mid - win);

			if (answer > per) {
				high = mid;
			} else {
				low = mid + 1;
			}

		}

		System.out.println(high-win);

	}

}
