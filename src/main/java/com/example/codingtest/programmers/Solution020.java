package com.example.codingtest.programmers;

class Solution020 {
	public int[] solution(int[] arr) {
		int[] answer = new int[3];
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;

		for (int i = 0 ; i < arr.length ; i++){
			if (arr[i] == 1){
				a++;
			}
			else if (arr[i] == 2){
				b++;
			}
			else{
				c++;
			}
		}

		max = Math.max(a,Math.max(b,c));

		answer[0] = max - a;
		answer[1] = max - b;
		answer[2] = max - c;

		return answer;
	}
}