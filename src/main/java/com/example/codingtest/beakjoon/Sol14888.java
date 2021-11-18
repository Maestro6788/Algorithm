package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol14888 {

	public static int[] arr;
	public static boolean[] visit;
	public static List<Integer> numList;
	public static List<Integer> arrList;
	public static int N;
	public static int count;


	public void sol() {
count = 0;
		numList = List.of(
			1,2,3,4,5,6
		);

		arrList = new ArrayList<>();
		arrList.add(2);
		arrList.add(1);
		arrList.add(1);
		arrList.add(1);


		for (int i : arrList){
			N += i ;
		}

		dfs(0,0);
		System.out.println(count);

	}

	public  void dfs(int depth, int num) {

		if (depth ==5){
			count++;
			return ;
		}

		for (int i = 1 ; i < N+1 ; i++){

			int index = -1;
			for (int j = 0 ; j < 4 ; j++){
				if (arrList.get(j) != 0){
					index = j;
					int a = arrList.get(j);
					arrList.set(j,a-1);
					break;
				}
			}

			if (index == -1){
				return;
			}
			if (depth == 0){
				if (index == 0){
					num =numList.get(i-1) + numList.get(i);
				}
				else if (index == 1){
					num =  numList.get(i-1) - numList.get(i);
				}
				else if (index == 2){
					num = numList.get(i-1) * numList.get(i);
				}
				else if (index == 3){
					num = numList.get(i-1) / numList.get(i);
				}
			}
			else{
				if (index == 0){
					num = num +  numList.get(i);
				}
				else if (index == 1){
					num = num  - numList.get(i);
				}
				else if (index == 2){
					num = num * numList.get(i);
				}
				else if (index == 3){
					num = num / numList.get(i);
				}
			}


			dfs(depth+1, num );
			arrList.set(index,arrList.get(index) +1);



		}



	}
}
