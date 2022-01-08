package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.Math;
import java.util.Map;

public class Sol16943Re {

	public static int[] arr;
	public static boolean[] visit;
	public static int N;
	public static int MAX;
	public static int TAGET;

	public static List<String> list;
	public static Map<Integer,Integer> map;


	public void sol() {
		N = 1230;
		MAX = 0;
		TAGET = 3456;
		int target = N;

		list = new ArrayList<>();

		map = new HashMap<>();

		while(target > 0){

			list.add(String.valueOf(target % 10));
			target /= 10;

		}
		visit = new boolean[list.size()];

		dfs(0,"");

		System.out.println(MAX);
	}

	public  void dfs(int depth, String num) {
		if (depth == 4){
			if (Integer.valueOf(num) < TAGET ){
				MAX = Math.max(MAX,Integer.valueOf(num));
			}
			return;
		}


		for (int i = 0 ; i< list.size() ; i++){
			if (list.get(i).equals("0")){
				MAX = -1;
				return;
			}
			if (visit[i] == false){
				visit[i] = true;
				dfs(depth +1 , num + list.get(i));
				visit[i] = false;
			}

		}



	}
}
