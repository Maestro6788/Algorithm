package com.example.codingtest.beakjoon;

import java.lang.Math;

public class Sol1107 {

	public static int[] arr;
	public static boolean[] visit;


	public void sol() {
		int realTarget = 500000;
		int target = 500000 ;
		int n = 3; // 고장난 개수
		int[] arr = new int[]{0,2,3,4,6,7,8,9};

		int answer = 0;
		answer = Math.abs(target-100);
		int tmp = 0;
		int axe =1 ;
		int count = 0;
		while(target  > 0){

			int index = target % 10;

			for (int i : arr){
				if (i == index){
					index++;
				}
			}

			tmp = tmp + (index* axe);
			axe *= 10;


			target /= 10;
			count++;
		}

		count = count + Math.abs(tmp - realTarget);

		answer = Math.min(answer,count);
		System.out.println(answer);

	}


}
