package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Sol2164 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < num; i++) {
			queue.offer(i + 1);
		}

		while (queue.size() > 1) {

			queue.poll();

			int n = queue.poll();

			queue.offer(n);

		}

		System.out.println(queue.poll());

	}
}
