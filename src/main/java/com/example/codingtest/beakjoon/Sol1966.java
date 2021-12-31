package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol1966 {

	public static class Info {
		int point;
		int index;

		public Info(int point, int index) {
			this.point = point;
			this.index = index;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {

			Queue<Info> queue = new LinkedList<>();

			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());

			StringTokenizer st1 = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				queue.offer(new Info(Integer.parseInt(st1.nextToken()), j));
			}

			// 크기가 1일때
			if (queue.size() == 1) {
				System.out.println("1");
				continue;
			}

			// 크기가 2이상 일때
			int count = 0;

			while (!queue.isEmpty()) {
				Info info = queue.poll();
				int size = queue.size();
				boolean flag = false;

				for (int j = 0; j < size; j++) {

					Info pollInfo = queue.poll();
					queue.offer(pollInfo);

					if (pollInfo.point > info.point) {
						flag = true;
					}

				}

				if (flag) {
					queue.offer(info);
				} else {

					if (info.index == index) {
						count++;
						System.out.println(count);
						break;
					}

					count++;

				}

			}

		}

	}
}
