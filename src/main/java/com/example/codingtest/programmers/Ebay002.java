package com.example.codingtest.programmers;

import java.util.HashMap;


class Ebay002 {
	public static boolean[] visit;
	public static String answer;
	public static int[] newArr;

	public String solution(int[] stones, int k) {

		newArr = new int[stones.length];


		for (int i = 0 ; i < stones.length ; i++){
			newArr[i] = stones[i];
		}

		dfs(stones,k,0,"");

		return answer;
	}


	public void dfs(int[] stones, int k, int depth, String str){

		int count = 0;
		boolean result = false;
		boolean result1 = false;
		int allCount = 0;

		for (int i = 0 ; i < stones.length ;i++){

			if(stones[i] != k-1){
				continue;
			}

			count = i;
			result = true;
			allCount++;
			for (int j = 0 ; j < stones.length ; j++){
				if ( i != j){
					if (stones[j] != 1){
						result1 = true;
						break;
					}

				}
			}

		}

		if (result== true && allCount== 1 && result1==false){
			answer = str + String.valueOf(count);

			return;

		}

		boolean[] chk = new boolean[stones.length];

		for (int i = 0 ; i < stones.length ; i++){

			if (depth == 0){
				for (int j = 0  ; j< stones.length ; j++){
					stones[j] = newArr[j];
				}
			}


			boolean flag = false;
			for (int j = 0 ; j < stones.length ; j++ ){
				if(j != i){

					if (stones[j] == 1){
						flag = true;
						chk[i] = true;

						break;
					}

				}


			}




			// 모든 경우 불가능 판별
			boolean stop = false;
			for (int j = 0 ; j < stones.length ; j++ ){

				if (chk[j] == false){
					break;
				}

				if (j == stones.length-1){
					stop = true;
				}

			}

			if (stop == true ){
				answer = "-1";
				return;
			}


			// 불가능한 경우 다음으로 이동
			if (flag){
				continue;
			}
			// 가능하면 +1 -1 -1 연산
			else{

				str += String.valueOf(i);
				for (int j = 0 ; j < stones.length ; j++ ){
					if(j != i){
						stones[j]--;
						continue;
					}
					stones[j]++;
				}

				dfs(stones,k,depth+1, str);

			}



		}



	}
}