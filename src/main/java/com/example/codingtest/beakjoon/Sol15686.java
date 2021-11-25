package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

// 치킨거리 https://www.acmicpc.net/problem/15686
public class Sol15686 {

	public static int[][] arr;
	public static boolean[] visit;
	public static int chickenMax;
	public static int Min;
	public static List<Point> chicken;
	public static List<Point> house;

	public class Point{
		int x;
		int y;

		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
		}
	}

	public void sol() {

		arr = new int[][] {
			{0, 0, 1, 0, 0},
			{0, 0, 2, 0, 1},
			{0, 1, 2, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 0, 2}
		};

		chickenMax =3;
		Min = 1000000;

		chicken = new ArrayList<>();
		house = new ArrayList<>();


		for (int i = 0 ; i < arr.length ; i++){
			for (int j = 0 ; j < arr[0].length ; j++){
				if(arr[i][j] == 1){
					house.add(new Point(i,j));
				}
				if (arr[i][j] == 2){
					chicken.add(new Point(i,j));
				}
			}
		}

		visit = new boolean[chicken.size()];


		distance(0,0);

		System.out.println(Min);

	}

	public void distance(int depth, int num) {
		System.out.println(num);
		if(num != 0){
			Min = Math.min(num,Min);
		}

		if (depth >= chickenMax){
			return;
		}


		for (int i = 0 ; i < chicken.size() ; i++){

			if (visit[i] == false){
				visit[i] = true;

				for (int index = 0 ; index < visit.length ; index++){
					System.out.print(visit[index] + " "+  index + " ");
				}
				System.out.println();


				int sum = 0;
				// 계산
				for (int j = 0 ; j < house.size() ; j++ ){
					int count = 0;
					for (int k = 0 ; k < chicken.size() ; k++){
						if (visit[k] == true){
							int add = 0;
							add = Math.abs(chicken.get(k).x - house.get(j).x) + Math.abs(chicken.get(k).y - house.get(j).y);

							if (count == 0){
								count = add;
							}
							count = Math.min(count,add);
						}

					}
					sum += count;

				}



				distance(depth +1, num + sum);
				visit[i] = false;
			}

		}


	}
}
