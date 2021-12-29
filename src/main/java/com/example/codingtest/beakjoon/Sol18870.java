package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Sol18870 {

	public static void main(String[] args) throws IOException {
		// 입력 받는 과정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[num];
		int[] arr1 = new int[num];


		for (int i =0; i< num ;i++){
			int x = Integer.parseInt(st.nextToken());
			arr[i] = x;
			arr1[i] = x;

		}

		Arrays.sort(arr);

		Map<Integer,Integer> map = new HashMap<>();
		int idx = 0;
		for (int n : arr){
			if (!map.containsKey(n)){
				map.put(n,idx++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int n : arr1){
			sb.append(map.get(n)).append(' ');
		}
		System.out.println(sb.toString());




	}

}
