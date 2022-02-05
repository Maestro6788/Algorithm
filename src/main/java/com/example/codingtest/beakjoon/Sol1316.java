package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol1316 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0 ;

		for (int i = 0 ; i < num ; i++){

			String str = br.readLine();
			boolean[] chk = new boolean['z'-'a'+1];

			for (int j = 0 ; j < str.length() ; j++){

				if (chk[str.charAt(j)-'a']){
					break;
				}

				for (int k = j + 1; k < str.length() ; k++){

					chk[str.charAt(j)-'a'] = true;

					if (str.charAt(j) != str.charAt(k)){
						break;
					}

					j++;

				}


				if (j==str.length()-1){
					count++;
				}

			}


		}

		System.out.println(count);




	}


}
