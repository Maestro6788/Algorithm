package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sol7795 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int size = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}

		int[][] arr = new int[map.size()][2];

		int index = 0;
		for (String s : map.keySet()){
			arr[index][0] = Integer.parseInt(s);
			arr[index][1] = map.get(s);
			index++;
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {


				return o2[1] - o1[1];
			}
		});

		String answer = "";
		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[i][1] ;j++){
				answer += String.valueOf(arr[i][0]);
				answer += " ";
			}

		}

		System.out.println(answer);

	}

}

