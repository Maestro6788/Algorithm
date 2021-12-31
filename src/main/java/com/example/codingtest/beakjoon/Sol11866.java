package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol11866 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int index = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1 ; i <= size ; i++){
			queue.offer(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append('<');

		while(queue.size()>1 ){

			for (int i = 0 ; i < index-1 ; i++){
				int n = queue.poll();
				queue.offer(n);
			}

			sb.append(queue.poll()).append(", ");
		}

		sb.append(queue.poll()).append('>');
		System.out.println(sb);


	}
}
