package com.example.codingtest.beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2798 {
	public static int ans;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		boolean[] visit = new boolean[N];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}


		dfs(visit, arr,3,M,0);

		System.out.println(ans);

	}
	public static void dfs(boolean[] visit, int[] arr , int size , int answer, int depth){

		if (depth == size){
			int sum = 0;
			for (int i = 0 ; i < visit.length ; i++){

				if (visit[i] == true){
					sum+=arr[i];
				}
			}

			if (sum <= answer ){
				ans = Math.max(ans,sum);
			}



		}


		for (int i = 0  ; i< arr.length ; i++){

			if (visit[i] == false){

				visit[i] = true;
				dfs(visit,arr,size,answer,depth+1);
				visit[i] = false;

			}

		}

	}

}
