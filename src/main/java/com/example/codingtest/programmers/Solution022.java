package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution022 {
	public int[] solution(String s) {
		List<Integer> answer = new ArrayList<>();

		for (int i = 0 ; i < s.length() ; ){
			int count = 1 ;
			for (int j = i+1 ;  j < s.length() ; j++){
				if (s.charAt(i) == s.charAt(j)){
					count++;
				}
				else{
					break;
				}

			}
			i = i + count ;
			answer.add(count);
		}

		if (s.charAt(0) == s.charAt(s.length()-1)){
			answer.set(0,answer.get(0)+answer.get(answer.size()-1));
			answer.remove(answer.size()-1);
		}
		Collections.sort(answer);

		System.out.println(answer);

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}