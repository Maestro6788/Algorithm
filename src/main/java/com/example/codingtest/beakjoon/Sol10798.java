package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol10798 {

	public static String[][] arr;
	public static boolean[] visit;

	public void sol() {
		arr = new String[][]{{"A","A","B","C","D","D"},{"a","f","z","Z"},{"0","9","1","2","1"},{"a","8","E","W","g","6"},{"P","5","H","3","k","x"}};
		String answer = "";
		int maxLength = 0;
		for (int i = 0 ; i < arr.length ; i++){
			maxLength = Math.max(maxLength, arr[i].length);
		}


		String[][] arrCheck = new String[maxLength][maxLength];

		for (int i = 0 ; i < arr.length ; i++){

			for (int j = 0 ; j < arr[i].length ; j++){

				arrCheck[i][j] = arr[i][j];

			}
		}


		for (int i = 0 ; i  < maxLength ; i++ ){
			for (int j = 0 ; j < arrCheck.length ; j++){
				if (arrCheck[j][i] != null){
					answer += arrCheck[j][i];
				}
			}
		}
		System.out.println(answer);

		List<String> a = new ArrayList<>();

	}

	public static void dfs(int N, int M, int depth) {

	}
}
