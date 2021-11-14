package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution009 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		List<Integer> lotto = new ArrayList<>();
		List<Integer> num = new ArrayList<>();
		int[][] arr = new int[][]{{6,1},{5,2},{4,3},{3,4},{2,5},{1,6},{0,6}}; //(맞춘개수, 등수)



		int min = 0;
		int count = 0;
		for (int i : lottos){
			lotto.add(i);
			min = Math.max(min, i);
			if (i == 0){
				count++;
			}
		}

		for (int i : win_nums){
			num.add(i);
		}


		if(min == 0){
			answer[0] = 1;
			answer[1] = 6;

			return answer;
		}

		int n = 0;

		for (int i =0 ; i < lotto.size() ; i++){

			if (num.contains(lotto.get(i))){
				n++;
			}

		}

		for (int i = 0; i < arr.length ; i++){

			if(arr[i][0] == n){
				if (i <= 1){
					answer[0] = arr[0][1];
					answer[1] = arr[i][1];
				}
				else{
					answer[0] = arr[i-count][1];
					answer[1] = arr[i][1];

				}
				break;
			}


		}

		return answer;
	}
}