package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol14889 {
	//https://www.acmicpc.net/problem/14889
	//https://www.acmicpc.net/problem/16198

	public static int[][] arr;
	public static boolean[] visit;
	public static int num;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());

		for (int i = 0 ; i < num ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0 ; j < num ; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}




	}



}
