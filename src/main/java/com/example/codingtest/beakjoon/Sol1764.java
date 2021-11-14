package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol1764 {

	public static int[] arr;
	public static boolean[] visit;
	public static int N = 3;
	public static int M = 4;
	public static List<String> listenArr;
	public static List<String> speakArr;
	public static List<String> answer;

	public void sol() {
		listenArr = List.of("ohhenrie",	"charlie", "baesangwook");
		speakArr = List.of("obama", "baesangwook", "ohhenrie", "clinton");
		answer = new ArrayList<>();

		for (int i = 0; i < listenArr.size() ; i++){

			for (int j = 0 ; j < speakArr.size() ; j++){

				if (listenArr.get(i).equals(speakArr.get(j))){
					answer.add(listenArr.get(i));
				}

			}
		}

		Collections.sort(answer);
		System.out.println(answer);

	}

	public static void dfs(int N, int M, int depth) {

	}
}
