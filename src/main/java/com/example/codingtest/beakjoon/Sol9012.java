package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sol9012 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {

			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			boolean flag = false;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == '(') {
					stack.add(str.charAt(j));
				}

				if (str.charAt(j) == ')') {

					if (stack.isEmpty()) {
						System.out.println("NO");
						flag = true;
						break;
					}

					stack.pop();

				}

			}

			if (!stack.isEmpty() && flag == false) {
				System.out.println("NO");

			}
			if (stack.isEmpty() && flag == false) {
				System.out.println("YES");

			}

		}

	}
}
