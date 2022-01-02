package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol3085 {

	public static int max;
	public static int num;
	public static char[][] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		char[][] arr = new char[num][num];
		max = 0;

		// 입력
		for (int i =0 ;i  < num  ; i++){

			String str = br.readLine();

			for (int j = 0 ;  j < str.length() ; j++){
				arr[i][j] = str.charAt(j);
			}
		}


		// 연산 시작
		// 가로 확인
		for (int i =0 ;i  < num  ; i++){

			for (int j = 0 ;  j < num ; j++){

				if (j == num-1){

					char tmp = arr[i][0];
					arr[i][0] = arr[i][j];
					arr[i][j] = tmp;

					checkArr();

					char tmpReturn = arr[i][0];
					arr[i][0] = arr[i][j];
					arr[i][j] = tmpReturn;

					continue;
				}


				char tmp = arr[i][j+1];
				arr[i][j+1] = arr[i][j];
				arr[i][j] = tmp;

				checkArr();

				char tmpReturn = arr[i][j+1];
				arr[i][j+1] = arr[i][j];
				arr[i][j] = tmpReturn;

			}
		}


		for (int i =0 ;i  < num  ; i++){

			for (int j = 0 ;  j < num ; j++){

				if (i == num-1){

					char tmp = arr[0][j];
					arr[0][j] = arr[i][j];
					arr[i][j] = tmp;

					checkArr();

					char tmpReturn =  arr[0][j];
					arr[0][j] = arr[i][j];
					arr[i][j] = tmpReturn;

					continue;
				}


				char tmp = arr[i+1][j];
				arr[i+1][j] = arr[i][j];
				arr[i][j] = tmp;

				checkArr();

				char tmpReturn = arr[i+1][j];
				arr[i+1][j] = arr[i][j];
				arr[i][j] = tmpReturn;

			}
		}






	}

	public static void checkArr(){

		for (int i =0 ;i  < num  ; i++) {

			char col = ' ';
			int colCount = 1;
			for (int j = 0; j < num; j++) {

				if (j == 0){
					col = arr[i][j];
					continue;
				}

				if (arr[i][j] == arr[i][j+1]){
					colCount++;
				}
				else{
					break;
				}
			}




		}


	}


}
