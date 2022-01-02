package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Sol2293 {

	public static int[] arr;
	public static int num;
	public static int price;
	public static List<int[]> list;


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken());
		price = Integer.parseInt(st.nextToken());
		arr = new int[num];

		int[] count = new int[num];
		list = new ArrayList<>();

		for (int i = 0 ; i < num ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		backTracking(0, price, count);
		System.out.println(list);

	}

	public static void backTracking(int depth, int totalPrice,int[] count){


		if (totalPrice >= 10){

			if (totalPrice == 10){

				list.add(count);
				return;

			}

		}

		for (int i = 0 ; i < num ; i++ ){

			count[i]++;

			backTracking(depth+1, totalPrice + arr[i], count);

			count[i]--;

		}


	}

}
