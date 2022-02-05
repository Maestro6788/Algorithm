package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol8958 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 0 ; i < num ; i++){

			String str = br.readLine();
			int count = 1 ;
			int sum = 0;

			for (int j = 0 ; j < str.length() ; j++){

				if(str.charAt(j) == 'O'){
					sum += count;
					count++;
				}
				if (str.charAt(j) == 'X'){
					count = 1;
				}

			}

			System.out.println(sum);


		}




	}


}
