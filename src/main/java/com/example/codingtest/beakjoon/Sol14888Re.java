package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol14888Re {

	public static int[] arr;
	public static int[] operator;
	public static int num;
	public static int answer;
	public static int min;
	public static int max;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());  // 주어지는 숫자의 개수

		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[num];
		operator = new int[4];

		min = Integer.MAX_VALUE;
		max = 0;

		for (int i = 0 ; i < num ; i++){
			arr[i] = Integer.parseInt(st.nextToken()); // 주어지는 숫자 배열 저장
		}

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < 4 ; i++){
			operator[i] = Integer.parseInt(st1.nextToken()); // 연산자 저장
		}

	}


	public static void dfs(){



		for (int i = 0 ; i < 4 ; i++){


			if (operator[i] > 0){

				operator[i]--;

				dfs();

				operator[i]++;
			}

		}


	}


}
