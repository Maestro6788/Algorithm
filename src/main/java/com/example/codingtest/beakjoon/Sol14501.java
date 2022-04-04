package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.servlet.ServletOutputStream;

public class Sol14501 {

	/**
	 * 비서는 상담을 해야 한다.
	 * 1~n+1 하지만 최대한 많은 상담을 해야한다.
	 * 걸리는 시간과 금액이 줘진다.
	 * 최대 이익을 출력하라...
	 */

	// 풀이방법 : DFS vs DP
	// 지금은 DFS!

	public static int MAX = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());  // 주어지는 숫자의 개수
		int[][] arr = new int[num][2];

		for (int i = 0  ; i < num ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i =0; i < num ;i++){
			dfs(i,i,num,0,arr[i][0],arr);
		}

		System.out.println(MAX);

	}

	public static void dfs(int start, int depth, int size, int sum,int remainDay, int[][] arr){

		if (depth == size){
			MAX = Math.max(sum,MAX);
			return;
		}


		for (int i = depth ; i < size ; i++){

			if (remainDay==1){
				dfs(depth+1,depth+1,size,sum + arr[start][1],arr[depth+1][0],arr);
			}
			else{
				dfs(start,depth+1,size,sum,remainDay-1,arr);
			}

		}


	}



}
