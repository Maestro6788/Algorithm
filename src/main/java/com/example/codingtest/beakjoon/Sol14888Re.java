package com.example.codingtest.beakjoon;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Sol14888Re {

	public static int[] arr;
	public static boolean[] visit;
	public static List<Integer> num;
	public static List<Integer> operater;
	public static int N;


	public void sol() {

		num = new ArrayList<>();
		operater = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);

		operater.add(2);
		operater.add(1);
		operater.add(1);
		operater.add(1);
		N = num.size();

		int answer = 0;

		dfs(0,answer);






	}

	public  void dfs(int depth,int answer) {

		if (depth == N){
			System.out.println(answer);
			return;
		}

		for (int i = 0 ; i < 4 ; i++){

			if (operater.get(i) > 0){
				operater.set(i,operater.get(i)-1);

				if (depth ==0){
					if (i == 0){
						answer = num.get(depth) + num.get(depth+1);
					}
					else if (i == 1){
						answer = num.get(depth) - num.get(depth+1);
					}
					else if (i == 2){
						answer = num.get(depth) * num.get(depth+1);
					}
					else if (i == 3){
						answer = num.get(depth) / num.get(depth+1);
					}
				}
				else{
					if (i == 0){
						answer = answer + num.get(depth+1);
					}
					else if (i == 1){
						answer = answer - num.get(depth+1);
					}
					else if (i == 2){
						answer = answer * num.get(depth+1);
					}
					else if (i == 3){
						answer =answer / num.get(depth+1);
					}
				}


				dfs(depth+1,answer);
				operater.set(i,operater.get(i)+1);

			}



		}



	}
}
