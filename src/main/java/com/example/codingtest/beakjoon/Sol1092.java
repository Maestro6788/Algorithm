package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sol1092 {

	public static void main(String[] args) throws IOException {

		// 입력 받는 과정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int crainNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int maxCrain = 0;
		int[] crainArr = new int[crainNum];
		for (int i = 0; i < crainNum; i++) {
			crainArr[i] = Integer.parseInt(st.nextToken());
			maxCrain = Math.max(maxCrain,crainArr[i]);
		}

		int containerNum = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] containerArr = new int[containerNum];
		int maxContain = 0;

		for (int i = 0; i < containerNum; i++) {
			containerArr[i] = Integer.parseInt(st.nextToken());
			maxContain = Math.max(maxContain,containerArr[i]);

		}

		if (maxContain > maxCrain){
			System.out.println(-1);
			return;
		}

		// 본격 구현현

		//오름차순 정력
		boolean[] visit = new boolean[containerNum];
		int time = 0;

		while (true) {
			// 한 턴에 옮겨지는 상자 수 - 한터 종료시 0이면 break;
			int count = 0;

			// 큰 수 부터 제거
			// 크레인 선택
			for (int i = crainNum - 1; i >= 0; i--) {

				// 상자 선택
				for (int j = containerNum - 1; j >= 0; j--) {

					// 상자가 남아 있으면
					if (visit[j] == false) {

						// 픽한다.
						if (containerArr[j] <= crainArr[i]) {
							visit[j] = true;
							count++;
							break;
						}

					}

				}

			}

			if (count == 0) {
				break;
			}

			time++;

		}



		System.out.println(time);

	}

}
