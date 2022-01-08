package com.example.codingtest.programmers;

// 짝지어서 제거

import java.util.Stack;

import jdk.swing.interop.SwingInterOpUtils;

class Solution045 {

	public int solution(String s) {
		int answer = -1;

		Stack<Character> stack = new Stack<>();
		stack.add(s.charAt(0));

		int count = 1;
		while(count < s.length()){



			if (stack.peek() == s.charAt(count)){

				stack.pop();
				if (count < s.length()-1 && stack.isEmpty()){
					stack.add(s.charAt(count+1));
					count+=2;
				}
				else{
					count++;
				}

			}
			else{
				stack.add(s.charAt(count));
				count++;
			}

		}

		System.out.println(stack);

		if (stack.isEmpty()){
			return 1;
		}
		else{
			return 0;
		}

	}
}