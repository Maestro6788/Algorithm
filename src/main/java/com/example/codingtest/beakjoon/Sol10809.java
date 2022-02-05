package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 'a' ; i <= 'z' ; i++){

			int index = -1;

			for (int j = 0 ; j < str.length() ; j++){

				if (i == str.charAt(j)){
					index = j;
					break;
				}

			}

			System.out.print(index + " ");

		}




	}


}
