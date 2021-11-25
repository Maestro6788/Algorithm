/*
package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] weight = new Integer[n];

		for (int i=0; i<n; i++) {
			weight[i] = Integer.parseInt(st.nextToken());
		}



		int count= 1;
		Arrays.sort(weight,Collections.reverseOrder());
		int scale = 0;

		while(true){

			int tmp = count;
			boolean flag = false;
			for (int i = 0 ; i < weight.length ; i++){

				if (weight[i] > tmp ){
					continue;
				}
				tmp -= weight[i];

				if (tmp == 0){
					flag = true;
					break;
				}

			}

			if (flag == false){
				break;
			}
			count++;


		}

		System.out.println(count);



	}


}
*/
