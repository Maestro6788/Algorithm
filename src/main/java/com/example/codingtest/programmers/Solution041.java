package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;


class Solution041 {
	public static int count;

	public int solution(int[] arr) {
		int answer = 0;
		count = 0;


		for (int i =3 ; i <= arr.length ; i++){
			boolean visit[] = new boolean[arr.length];
			dfs(arr,visit,0,i,0);
		}

		System.out.println(count);
		return answer;
	}

	public void dfs(int[] arr, boolean[] visit,  int depth, int size, int idx) {

		if (depth == size){

			int[] tmp = new int[size];
			int index = 0;
			for (int i = 0 ; i < visit.length ; i++){
				if (visit[i] == false){
					tmp[index] = arr[i];
					index++;
				}
			}


			int upFlag = 0;
			int downFlag = 0;
			for (int i = 1 ; i < tmp.length ; i++){

				if (tmp[i-1] < tmp[i] ){
					upFlag = 1;
				}

				if (upFlag == 1 && tmp[i-1] > tmp[i] ){
					downFlag = 1;
				}

				if (tmp[i-1] == tmp[i] ){
					return;
				}

				if (upFlag == 0 && tmp[i-1] > tmp[i] ){
					return;
				}

				if (downFlag == 1 && tmp[i-1] < tmp[i] ){
					return;
				}

			}

			if (upFlag == 1 && downFlag == 1){
				count++;
				for (int i = 0 ; i < tmp.length ; i++){
					System.out.print(tmp[i]);

				}
				System.out.println();
			}




		}


		for (int id = idx ; id < arr.length ; id++ ){

			if (visit[id] == false){
				visit[id] = true;
				dfs(arr,visit, depth+1, size, id);
				visit[id] = false;
			}


		}


	}
}