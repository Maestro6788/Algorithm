package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution011 {
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[progresses.length];

		for (int i = 0 ; i < progresses.length ; i++){
			if ((100-progresses[i])%speeds[i] == 0){
				arr[i] = (100-progresses[i])/speeds[i];
			}
			else {
				arr[i] = (100 - progresses[i]) / speeds[i] + 1;
			}
		}

		for (int i =0 ; i < arr.length ; i++){
			int count = 1;
			for (int j = i+1 ; j < arr.length ; j++){
				if (arr[i] < arr[j]){
					break;
				}
				count++;
			}
			list.add(count);
			i = i + count -1;
		}

		System.out.println(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}