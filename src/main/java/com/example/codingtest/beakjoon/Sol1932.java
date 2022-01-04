package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1932 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];

		for (int i = 0 ; i < num ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j  = 0 ; j <= i ; j++ ){
				arr[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		for (int i = num-2 ; i >= 0; i--){

			for (int j = 0 ; j <= i ; j++){

				arr[i][j] += Math.max(arr[i+1][j],arr[i+1][j+1]);

			}

		}

		System.out.println(arr[0][0]);

	}


}
