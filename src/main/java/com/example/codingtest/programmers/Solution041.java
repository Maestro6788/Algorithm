package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution041 {
	public static int count;
	public static int[][] arrlist;

	public int solution(int[] arr) {
		int answer = 0;
		count = 0;

		arrlist = new int[arr.length][1];

		for (int i = 0 ; i < arr.length ;i++){
			arrlist[i][0] = arr[i];
		}

		for (int i = 3; i <= arr.length; i++) {
			boolean[] visit = new boolean[arr.length];
			List<Integer> list = new ArrayList<>();
			dfs(i, arr, visit, list, 0);
		}

		System.out.println(count);

		return answer;
	}

	public void dfs(int size, int[] arr, boolean[] visit, List<Integer> list, int depth) {

		if (size == depth) {
			System.out.println(size);
			boolean upFlag = false;
			boolean downFlag = false;
			int countA = 0;

			for (int i = 1; i < list.size(); i++) {

				if (upFlag == false && list.get(i) <= list.get(i - 1)) {
					break;
				}

				if (list.get(i) > list.get(i - 1)) {
					upFlag = true;
					countA++;
				}

				if (list.get(i) <= list.get(i - 1)) {
					countA++;
					downFlag = true;
				}

			}

			if (upFlag == true && downFlag == true && countA == 2) {
				System.out.println(list);
				count++;
			}
			return;

		}

		for (int i = 0; i < arr.length; i++) {
			if (visit[i] == false) {
				visit[i] = true;

				if (list.size() > 1){
					int index = 0;
					for (int j = 0 ; j < arr.length ; j++){
						if (arrlist[j][0] == list.get(list.size()-1)){
							index = j;
							break;
						}
					}

					if (i > index ){
						list.add(arr[i]);
						dfs(size, arr, visit, list, depth + 1);
						list.remove(depth);
						visit[i] = false;
					}
					else{
						dfs(size, arr, visit, list, depth + 1);
						visit[i] = false;
					}


				}else{
					list.add(arr[i]);
					dfs(size, arr, visit, list, depth + 1);
					list.remove(depth);
					visit[i] = false;
				}



			}
		}

	}
}