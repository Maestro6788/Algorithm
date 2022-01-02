package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol12851 {

	public static int endNum;
	public static int startNum;
	public static int[] time;

	public static int beforeMin = 0;
	public static int count = 0;
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		startNum = Integer.parseInt(st.nextToken());
		endNum = Integer.parseInt(st.nextToken());
		time = new int[100001];

		dfs(startNum, 0);

		System.out.println(min);
		System.out.println(count);

	}

	public static void dfs(int num , int depth){

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(startNum);
		time[startNum] = 1;

		while(!queue.isEmpty()){

			int now = queue.poll();

			for (int i = 0 ; i < 3 ; i++){

				int next =0;

				if (i == 0){
					next =now + 1;
				}
				if (i == 1){
					next = now - 1;
				}
				if (i == 2){
					next = now * 2;
				}

				if (next < 0 || next > 100000) continue;

				if (next == endNum) {
					min = time[now];
					count++;
				}


			}




		}


	}

}



// public class Sol12851 {
//
// 	public static int endNum;
// 	public static int beforeMin = 0;
// 	public static int count = 0;
// 	public static int min = Integer.MAX_VALUE;
//
// 	public static void main(String[] args) throws IOException {
//
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int startNum = Integer.parseInt(st.nextToken());
// 		endNum = Integer.parseInt(st.nextToken());
//
// 		dfs(startNum, 0);
//
// 		System.out.println(min);
// 		System.out.println(count);
//
// 	}
//
// 	public static void dfs(int num , int depth){
//
// 		System.out.println(num);
//
// 		if (num == endNum){
//
//
//
// 			if (beforeMin == depth){
// 				count++;
// 			}
//
// 			if (beforeMin > depth){
// 				beforeMin = depth;
// 				count = 0;
// 			}
//
// 			min = Math.min(depth, min);
//
// 			return;
// 		}
//
// 		if (num > endNum*2){
// 			return;
// 		}
//
// 		dfs(num + 1 , depth + 1);
// 		dfs(num - 1 , depth + 1);
// 		dfs(num * 2 , depth + 1);
//
// 	}
//
// }
