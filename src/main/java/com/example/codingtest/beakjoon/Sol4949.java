package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sol4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean flag = false;

		for (int i = 0 ; i < str.length() ; i++){

			if (str.charAt(i) == '[' || str.charAt(i) == '('){
				stack.add(str.charAt(i));
			}

			if (str.charAt(i) == ']' || str.charAt(i) == ')'){

				if(stack.isEmpty()){
					flag = true;
					break;
				}
				else if (str.charAt(i) == ']' && stack.peek() == '[' ){
					stack.pop();
				}
				else if (str.charAt(i) == ')' && stack.peek() == '('){
					stack.pop();
				}
				else{
					flag = true;
					break;
				}

			}


		}

		if (flag){
			System.out.println("no");
		}
		else if (stack.isEmpty()){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}


	}


}
