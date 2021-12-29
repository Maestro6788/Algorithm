package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Sol11399 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < num ; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int answer = 0;
		int result = 0;
		for (int i = 0 ; i < num ; i++){
			answer +=  arr[i];
			result += answer;
		}

		System.out.println(result);
	}



}
