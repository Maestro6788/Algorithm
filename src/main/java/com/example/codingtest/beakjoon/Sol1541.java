package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Sol1541 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		List<Integer> list = new ArrayList<>();
		List<Character> plu = new ArrayList<>();

		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0 ; i < str.length() ; i++){
			if (str.charAt(i) == '-' || str.charAt(i) == '+'){
				plu.add(str.charAt(i));
				endIndex = i;
				list.add(Integer.parseInt(str.substring(startIndex,endIndex)));
				startIndex = i+1;
			}
		}
		list.add(Integer.parseInt(str.substring(startIndex,str.length())));

		while(plu.contains('+')){

			int index = 0;
			for (int i = 0  ; i < plu.size() ; i++){
				if (plu.get(i) == '+'){
					index = i;
					break;
				}
			}
			plu.remove(index);
			list.set(index, list.get(index) + list.get(index+1));
			list.remove(index+1);


		}

		int sum = list.get(0);
		for (int i = 1 ; i<list.size() ; i++){
			sum -= list.get(i);
		}

		System.out.println(sum);


	}


}
