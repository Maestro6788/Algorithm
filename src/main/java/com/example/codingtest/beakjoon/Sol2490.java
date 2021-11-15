package com.example.codingtest.beakjoon;

public class Sol2490 {

	public static String[][] arr;
	public static boolean[] visit;
	public static String[][] map;

	public void sol() {

		arr = new String[][]{{"0","1","0","1"},{"1","1","1","0"},{"0","0","1","1"}};

		map = new String[][]{
			{"0","E"},{"1","A"},{"2","B"},{"3","C"},{"4","D"}
		};

		for (int i = 0 ; i < arr.length;i++){
			int countOne =0;
			int countZero = 0;

			for (int j = 0 ; j < arr[0].length ; j++){
				if (arr[i][j].equals("0")){
					countZero++;
				}
				else{
					countOne++;
				}
			}

			String str = String.valueOf(countZero);

			for (int j = 0 ; j < map.length ; j++){
				if (map[j][0].equals(str)){
					System.out.println(map[j][1]);
				}

			}


		}

	}

	public static void dfs(int N, int M, int depth) {

	}
}
