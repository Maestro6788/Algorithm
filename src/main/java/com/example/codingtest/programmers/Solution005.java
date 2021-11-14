package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution005 {
	public int solution(int n) {
		int answer = 0;
		List<Integer> three =new ArrayList<>();

		// 10진법 3진법
		while(n > 0){
			three.add(n%3);
			n /= 3;
		}

		// 자동 역정렬
		//System.out.println(three);

		// 3진법에서 10진법으로 전환
		int esca = 1;
		for (int i = three.size()-1 ; i >= 0 ; i--){
			answer = answer + three.get(i) * esca;
			esca *= 3;
		}
		System.out.println(answer);


		return answer;
	}
}