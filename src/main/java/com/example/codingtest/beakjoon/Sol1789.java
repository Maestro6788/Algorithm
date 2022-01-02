package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1789 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());

		int count = 1;
		while( num > 0 ){

			num -= count;

			if (num <= 0){
				break;
			}

			count++;

		}

		System.out.println(count-1);


	}


}
