package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Sol1992 {

	public static Queue<Character> queue;
	public static char[][] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new char[num][num];
		queue = new LinkedList<>();

		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			for (int j = 0; j < num; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		dfs(0,num,0,0);

		int size = queue.size();
		for (int i = 0 ; i < size ; i++){
			System.out.print(queue.poll());
		}

	}

	public static void dfs(int index, int n , int x, int y){



		int one = 0;
		int zero = 0;

		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){

				if (arr[x+i][y+j] == '1'){
					one++;
				}
				if (arr[x+i][y+j] == '0'){
					zero++;
				}
			}
		}

		if (one == 0 || zero == 0){


			if (zero == 0){
				queue.offer('1');
			}
			if (one == 0){
				queue.offer('0');
			}


			return;
		}
		queue.offer('(');

		dfs(1,n/2,x,y);
		dfs(2,n/2,x,y+n/2);
		dfs(3,n/2,x+n/2,y);
		dfs(4,n/2,x+n/2,y+n/2);
		queue.offer(')');



	}


}
