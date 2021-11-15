package com.example.codingtest.beakjoon;

import java.util.List;

import org.apache.catalina.LifecycleState;

public class Sol1063 {

	public static int[] arr;
	public static boolean[] visit;

	public class Point{
		String str;
		int x;
		int y;

		public Point(String str, int x, int y){
			this.str =str;
			this.x =x;
			this.y = y;
		}
	}

	public class Trans{
		String str;
		int x;

		public Trans(String str, int x){
			this.str =str;
			this.x =x;
		}
	}

	public void sol() {
		List<Point> list = List.of(
			new Point("R",1,0),
			new Point("L",-1,0),
			new Point("B",0,-1),
			new Point("T",0,1),
			new Point("RT",1,1),
			new Point("LT",-1,1),
			new Point("RB",1,-1),
			new Point("LB",-1,-1)
		);

		List<Trans> trans = List.of(
			new Trans("A",1),
			new Trans("B",2),
			new Trans("C",3),
			new Trans("D",4),
			new Trans("E",5),
			new Trans("F",6),
			new Trans("G",7),
			new Trans("H",8)
		);


		int N = 5;
		String P1 = "A1";
		String P2 = "A2";



		for (int i = 0 ; i < trans.size() ; i++){
			if (P1.charAt(0) == trans.get(i).str.charAt(0)){
				P1 = String.valueOf(trans.get(i).x) + P1.charAt(1);

			}

			if (P2.charAt(0) == trans.get(i).str.charAt(0)){
				P2 = String.valueOf(trans.get(i).x) + P2.charAt(1);

			}
		}


		for (int i = 0 ; i < N ; i++){


		}



	}

	public static void dfs(int N, int M, int depth) {



	}
}
