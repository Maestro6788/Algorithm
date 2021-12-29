package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol14888 {

	public static int[] arr;
	public static int[] operator;
	public static int num;
	public static int answer;
	public static int min;
	public static int max;


	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[num];  // 줘진 숫자
		operator = new int[4];

		min = Integer.MAX_VALUE;
		max = 0;

		for (int i = 0 ; i < num ; i++){
			arr[i] = Integer.parseInt(st.nextToken());

		}

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < 4 ; i++){
			operator[i] = Integer.parseInt(st1.nextToken());

		}

		answer = arr[0];

		dfs(answer,0);




	}

	public static void dfs(int result, int depth){

		if (depth == num-1){
			System.out.println(result);
			max = Math.max(max, result);
			min = Math.min(min, result);
			return;
		}


		for (int i = 0 ; i < 4 ; i++){

			if (operator[i] > 0){

				operator[i]--;


				if (i == 0){
					result = result + arr[depth+1];
				}
				else if (i==1){
					result = result - arr[depth+1];
				}
				else if (i==2){
					result = result * arr[depth+1];
				}
				else if (i==3){
					result = result / arr[depth+1];
				}




				dfs(result,depth+1);

				operator[i]++;


			}


		}



	}



}
