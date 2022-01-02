package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol2501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				list.add(i);
			}
		}

		if (list.size() < index) {
			System.out.println(0);
			return;
		}

		System.out.println(list.get(index - 1));

	}

}
