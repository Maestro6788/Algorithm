package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol3048 {

	public static List<String> arr1;
	public static List<String> arr2;
	public static List<String> arrAll;

	public static boolean[] visit;
	public static int N1 = 3;
	public static int N2 = 4;
	public static int T = 3;

	public void sol() {
		arr1 = List.of("J", "L", "A");
		arr2 = List.of("C", "R", "U", "O");
		arrAll = new ArrayList<>();


		// arr1 역으로 넣기
		for (int i = arr1.size() - 1; i >= 0; i--) {
			arrAll.add(arr1.get(i));
		}

		// arr2 차례로 넣기
		for (String i : arr2) {
			arrAll.add(i);
		}


		//System.out.println(arrAll);

		for(int i = 0 ; i < T ; i++){
			dfs(i);
		}

		System.out.println(arrAll);
	}



	// dfs
	public static void dfs(int time) {

		if (time == T) {
			return;
		}

		for (int i = 0; i < arrAll.size() - 1; i++) {
			boolean flag1 = false;
			boolean flag2 = false;

			if (arr1.contains(arrAll.get(i))){
				flag1 = true;

			}
			if (arr2.contains(arrAll.get(i+1))){
				flag2 = true;
			}



			if (flag1 ==true && flag2==true){
				String tmp = arrAll.get(i+1);
				arrAll.set(i+1, arrAll.get(i)); // i+1 = i
				arrAll.set(i,tmp); // i = tmp
				i++;
			}

		}


	}

}
