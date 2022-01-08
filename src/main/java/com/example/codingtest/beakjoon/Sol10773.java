package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sol10773 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0 ; i  < num ;i++){
			int n = Integer.parseInt(br.readLine());

			if (n != 0){
				stack.add(n);
			}

			if (n==0){
				if (!stack.isEmpty()){
					stack.pop();
				}
			}
		}

		int size = stack.size();
		int answer = 0;
		for (int i = 0 ; i  < size ; i++) {
			answer += stack.pop();
		}

		System.out.println(answer);
	}


}
