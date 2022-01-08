package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol10844 {

	public static int index;
	public static int count;

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		index = Integer.parseInt(br.readLine());

		char[][] arr = new char[][]{{'1','1'},{'1','1'}};

		for (int i = 1 ; i <= 9 ; i++){


			dfs(i,1);

		}

		System.out.println(count);

	}

	public static void dfs(int num , int depth){

		if (depth == index){
			count++;
			return;
		}

		if (num == 0){
			dfs(num+1, depth +1);
		}

		if (num == 9){
			dfs(num-1, depth +1);

		}

		if (num != 0 && num != 9 ){
			dfs(num+1, depth +1);
			dfs(num-1, depth +1);
		}





	}


}
