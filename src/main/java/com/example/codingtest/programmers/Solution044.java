package com.example.codingtest.programmers;


class Solution044 {
	public String solution(String s) {
		String answer = "";


		String[] arr= s.split(" ");

		for (int i = 0 ;i < arr.length ; i++){

			if (arr[i].charAt(0) >= 'a' &&arr[i].charAt(0) <= 'z'){

				arr[i] = String.valueOf(Character.isUpperCase(arr[i].charAt(0))) + arr[i].substring(1,arr[i].length());
			}

			System.out.println(arr[i]);

		}



		return answer;
	}
}