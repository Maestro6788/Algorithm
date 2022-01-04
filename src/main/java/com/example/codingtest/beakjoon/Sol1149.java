package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1149 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][3];

		for (int i = 0 ; i < num ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}


		for (int i = 1 ; i < num ; i++){

			// R
			arr[i][0] = Math.min(arr[i-1][1],arr[i-1][2]) + arr[i][0];
			// G
			arr[i][1] = Math.min(arr[i-1][0],arr[i-1][2]) + arr[i][1];
			// B
			arr[i][2] = Math.min(arr[i-1][0],arr[i-1][1]) + arr[i][2];

		}

		System.out.println(Math.min(arr[num-1][0],Math.min(arr[num-1][1],arr[num-1][2])));


	}
}
