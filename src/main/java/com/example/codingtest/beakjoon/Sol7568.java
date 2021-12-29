package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol7568 {

	public static class Info{
		int weight;
		int tall;

		public Info(int weight, int tall) {
			this.weight = weight;
			this.tall = tall;
		}

		@Override
		public String toString() {
			return "Info{" +
				"weight=" + weight +
				", tall=" + tall +
				'}';
		}
	}

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		List<Info> list = new ArrayList<>();

		for (int i =0; i< num ;i++){

			StringTokenizer st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int tall = Integer.parseInt(st.nextToken());
			list.add(new Info(weight,tall));

		}


		for (int i = 0 ; i < num ; i++){
			int count = 0;
			for (int j = 0 ; j < num ; j++){

				if (list.get(i).weight < list.get(j).weight && list.get(i).tall < list.get(j).tall){
					count++;
				}
			}

			System.out.print(count+1 + " ");

		}





	}
}
