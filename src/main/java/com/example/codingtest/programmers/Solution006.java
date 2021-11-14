package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution006 {
	public int solution(int[] d, int budget) {
		int answer = 0;

		List<Integer> list = new ArrayList<>();

		for (int i : d){
			list.add(i);
		}
		Collections.sort(list);

		for (int i = 0 ; i < list.size() ; i++){

			if(budget - list.get(i) < 0){
				break;
			}

			budget -= list.get(i);
			answer++;
		}

		//System.out.println(answer);
		return answer;
	}
}