package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol2667 {

	public static int n;
	public static int[][] map;
	public static boolean[][] visited;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static List<Integer> list;


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		map = new int[n][n];
		visited = new boolean[n][n];
		list = new ArrayList<>();

		//전체 사각형 입력 받기
		for(int i=0; i<n; i++){
			String input = sc.next();
			for(int j=0; j<n; j++){
				map[i][j] = input.charAt(j)-'0';
			}
		}

		for (int i = 0 ; i < n ; i++){

			for (int j = 0 ; j < n ; j++){

				if (visited[i][j] == false && map[i][j] == 1){

					int num = dfs(0, i , j);
					list.add(num);
				}

			}

		}

		System.out.println(list.size());
		for (int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}

	}


	public static int dfs(int depth, int x, int y){


		for (int i = 0 ; i < 4 ; i++){

			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n){

				if (visited[nx][ny] == false && map[nx][ny] == 1){
					visited[nx][ny] = true;
					depth = dfs(depth+1,nx,ny);
				}

			}


		}


		return depth;
	}

}
