package com.example.codingtest.programmers;

class Solution008 {
	public int solution(int left, int right) {
		int answer = 0;

		// 범위내 약수 구하기
		for (int j = left ; j <= right ; j++){
			int cnt = 0 ;

			//약수 구하기
			for (int i = 1; i * i <= j; i++) {
				if (j % i == 0) {
					cnt++;
					if (i * i < j) {
						cnt++;
					}
				}
			}
			if (cnt % 2 == 0){
				answer += j;
			}
			else{
				answer -= j;
			}

		}

		return answer;
	}
}