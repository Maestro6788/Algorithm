package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Line002 {
	public static int count;
	public static int[][] arrlist;
	public static boolean[] visit;
	public static List<Integer> list;

	public int solution(int[] arr) {
		int answer = 0;


		// 0부터 길이-2 까지
		for (int i = 0 ; i < arr.length -2 ; i++){

			// 길이 3 부터 ~
			for (int j = i ; j  < arr.length ; j++){

				if(j-i >= 2){

					for (int k = i ; k <= j ; k++){
						System.out.print(arr[k]);
					}

				}

				System.out.println();
			}


		}



		return answer;
	}




}