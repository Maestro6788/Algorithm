package com.example.codingtest.beakjoon;

import java.util.List;
import java.util.ArrayList;

public class Sol1527 {


	public void sol() {
		int n = 1000000;
		int m = 5000000;

		List<String> list = new ArrayList<>();

		for (int i = n ; i <= m ; i++ ){
			list.add(String.valueOf(i));
		}

		int answer = 0;
		for (int i = 0 ; i < list.size() ; i++){
			boolean flag = false;
			for (int j = 0 ; j < list.get(i).length() ; j++){
				if (list.get(i).charAt(j) == '4' || list.get(i).charAt(j) == '7' ){
					flag = true;
				}
				else{
					flag = false;
					break;
				}
			}
			if (flag == true){
				answer++;
			}
		}

		System.out.println(answer);



	}

}
