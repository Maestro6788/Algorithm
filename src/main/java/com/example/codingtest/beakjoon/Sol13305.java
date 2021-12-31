package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] distance = new long[num-1];
		long[] city = new long[num];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < num-1 ; i++){
			distance[i] = Integer.parseInt(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < num ; i++){
			city[i] = Integer.parseInt(st1.nextToken());
		}


		long price = city[0];
		long sum = city[0] * distance[0];
		for (int i = 1; i < num-1 ; i++ ){

			if (price > city[i]){
				price = city[i];
			}

			sum += (price*distance[i]);


		}

		System.out.println(sum);

	}


}
