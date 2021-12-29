package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol11047 {

	public static int num;
	public static int price;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken());
		price = Integer.parseInt(st.nextToken());

		int[] arr = new int[num];
		int index = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < num; i++) {
			if (arr[i] > price) {
				index = i - 1;
				break;
			}
			index = i;
		}

		int answer = 0;

		if (index == -1) {
			answer = 0;
			return;
		}

		while (price > 0) {

			//System.out.println(index);
			price -= arr[index];
			answer++;

			if (price == 0) {
				break;
			}

			if (price < 0) {
				price += arr[index];
				answer--;
				index--;
			}
		}
		System.out.println(answer);

	}

}
