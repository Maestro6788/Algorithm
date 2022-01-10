package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol1654 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());
		int max = 0;
		int[] arr = new int[num];

		for(int i = 0 ; i< num ; i++){
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		int low = 1;
		int high = max;


		while(low <= high){

			int mid = (low+high)/2;
			int midCount = 0;

			for (int i = 0 ; i < arr.length ; i++){

				midCount += arr[i] / mid;
			}

			if (midCount >= size){
				low = mid+1;
			}
			else{
				high = mid-1;
			}


		}

		System.out.println(high);

	}


}
