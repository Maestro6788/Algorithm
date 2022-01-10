package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol1987 {

	/**
	 * 백트래킹 문제
	 * dfs 처럼 맵 탑색하는 문제
	 * but! 백트래킹이 적용되어야 함
	 */

	public static char[][] arr;
	public static boolean[][] visit;
	public static List<Character> list;
	public static int max = 0;

	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		arr = new char[y][x];
		visit = new boolean[y][x];
		list = new ArrayList<>();

		for (int i = 0 ; i < y ; i++){
			String str = br.readLine();
			for (int j = 0 ; j  < str.length() ; j++){
				arr[i][j] = str.charAt(j);
			}
		}

		visit[0][0] = true;
		list.add(arr[0][0]);
		dfs(1,0,0);

		System.out.println(max);
	}

	public static void dfs(int depth, int x, int y){
		/**
		 * 얼마나 멀리 갔는지가 문제기 때문에
		 * 최대로 들어간 깊이를 max로 잡는다.
		 * 꼭 return을 하지 않아도 된다.
		 */
		max = Math.max(depth, max);

		for (int i = 0 ; i < 4 ; i++){

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < arr[0].length && ny < arr.length){
				if (visit[ny][nx] == false){
					/**
					 * 기존과 다를게 없다.
					 * 문제 조건이 있는지 확인한다.
					 */
					if(!list.contains(arr[ny][nx])){
						visit[ny][nx] = true;
						list.add(arr[ny][nx]);
						dfs(depth+1,nx,ny);
						list.remove(depth);
						visit[ny][nx] = false;
					}
				}
			}

		}

	}



}
