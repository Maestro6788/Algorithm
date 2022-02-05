package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol9372 {

	public static class Point {
		int nationOne;
		int nationTwo;

		public Point(int nationOne, int nationTwo) {
			this.nationOne = nationOne;
			this.nationTwo = nationTwo;
		}

		@Override
		public String toString() {
			return "Point{" +
				"nationOne=" + nationOne +
				", nationTwoe=" + nationTwo +
				'}';
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testNum = Integer.parseInt(br.readLine());

		for (int testIndex = 0 ; testIndex < testNum ; testIndex++){

			StringTokenizer st = new StringTokenizer(br.readLine());
			int nationNum = Integer.parseInt(st.nextToken());
			int flyNum = Integer.parseInt(st.nextToken());

			boolean[] arr = new boolean[nationNum+1];
			List<Point> list = new ArrayList<>();

			for (int i = 0 ; i < flyNum  ; i++){
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				list.add(new Point(Integer.parseInt(st1.nextToken()),Integer.parseInt(st1.nextToken())));
			}

			for (int i = 0 ; i < list.size() ; i++){
				if (list.get(i).nationOne == 1 || list.get(i).nationTwo ==1){
					if (arr[1] == false){
						dfs(list, list.get(i), arr);
					}
				}


			}





		}

	}

	public static void dfs(List<Point> list, Point p, boolean[] arr){
		Queue<Point> queue = new LinkedList<>();
		queue.add(p);
		arr[p.nationOne] = true;
		arr[p.nationTwo] = true;

		int count = 1;

		while(!queue.isEmpty()){

			Point point = queue.poll();

			for (int i = 0 ; i < list.size() ; i++){

				if (list.get(i).nationTwo == point.nationTwo ){

					if (arr[list.get(i).nationOne] == false){

						arr[list.get(i).nationOne] = true;
						queue.add(list.get(i));
						count++;
						continue;
					}

				}

				if (list.get(i).nationOne == point.nationTwo){

					if (arr[list.get(i).nationTwo] == false){

						arr[list.get(i).nationTwo] = true;

						queue.add(list.get(i));
						count++;
						continue;
					}

				}

			}


			if (listChk(arr)){
				System.out.println(count);
				break;
			}


		}




	}

	public static boolean listChk(boolean[] arr){

		for (int i = 0 ; i < arr.length ; i++){

			if (arr[i] == false){
				return false;
			}

		}
		return true;
	}


}
