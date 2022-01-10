package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Sol1759 {

	public static int num;
	public static int count;
	public static boolean[] visit;
	public static String[] arr;
	public static List<String> list;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 갯수 입력받기
		count = Integer.parseInt(st.nextToken());
		num = Integer.parseInt(st.nextToken());
		visit = new boolean[num];
		arr = new String[num];
		list = new ArrayList<>();

		// 배열 입력받기
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i  = 0 ; i < num ; i++){
			arr[i] = st1.nextToken();
		}

		Arrays.sort(arr);

		dfs(0,0);





	}


	public static void dfs(int depth, int idx){

		// 종료조건
		if(depth == count){

			int mo = 0;
			int ja = 0;


			for (int i = 0 ; i < list.size() ; i++){

				if (list.get(i).equals("a")){
					mo++;
					continue;
				}
				if (list.get(i).equals("e")){
					mo++;
					continue;
				}
				if (list.get(i).equals("i")){
					mo++;
					continue;
				}
				if (list.get(i).equals("o")){
					mo++;
					continue;
				}
				if (list.get(i).equals("u")){
					mo++;
					continue;
				}

				ja++;


			}

			if (mo >= 1 && ja >=2){

				for (int j = 0 ; j < list.size() ; j++ ){
					System.out.print(list.get(j));
				}
				System.out.println();
			}

			return;
		}

		// 총 개수 백트래킹
		for(int i = idx ; i < num ; i++ ){

			if(visit[i] == false){

				visit[i] = true;
				list.add(arr[i]);
				dfs(depth+1,i+1);
				list.remove(depth);
				visit[i] = false;


			}





		}


	}


}
