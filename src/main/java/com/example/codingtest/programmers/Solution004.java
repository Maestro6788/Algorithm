package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution004 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		List<Integer> lostList = new ArrayList<>();
		for (int i : lost){
			lostList.add(i);
		}
		List<Integer> reserveList = new ArrayList<>();
		for (int i : reserveList){
			reserveList.add(i);
		}



		for (int i= 0; i < lostList.size() ; i++){
			for (int j= 0; j < reserveList.size() ; j++){
				if (Math.abs(lostList.get(i)-reserveList.get(j)) == 1){
					answer++;
					reserveList.set(j,100);
					break;
				}

			}

		}



		return answer;
	}
}