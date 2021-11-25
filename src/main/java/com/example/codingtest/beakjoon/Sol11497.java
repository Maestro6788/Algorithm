package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol11497 {

	public static int[] arr;
	public static boolean[] visit;
	public static int min;
	public static List<Integer> list;


	public void sol() {
		arr = new int[]{1 ,2, 3, 4};
		visit = new boolean[arr.length];
		min = Integer.MAX_VALUE;
		list = new ArrayList<>();

		dfs(0);



	}

	public  void dfs(int depth) {

		if (depth == arr.length){

			System.out.println(list);


			return;
		}



		for (int i = 0 ; i < arr.length ; i++){

			if (visit[i] == false){
				visit[i] = true;
				list.add(arr[i]);
				dfs(depth +1);
				list.remove(depth);
				visit[i] = false;
			}
		}




	}
}
