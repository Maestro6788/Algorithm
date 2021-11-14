package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution007 {
	public int[] solution(int[] numbers) {

		int index = 0;

		List<Integer> answer = new ArrayList<>();

		List<Integer> list = new ArrayList<>();

		for (int i : numbers){
			list.add(i);
		}


		for (int i = 0  ; i < list.size() ; i++){
			for (int j = i+1  ; j < list.size() ; j++){
				if (!answer.contains(list.get(i) + list.get(j))){
					answer.add(i,list.get(i) + list.get(j));
				}
				index++;
			}
		}

		return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}