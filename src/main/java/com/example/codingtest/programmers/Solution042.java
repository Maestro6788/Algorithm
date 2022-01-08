package com.example.codingtest.programmers;

import java.util.List;

class Solution042 {

	public static boolean[] visit;
	public int solution(int n, int[][] wires) {
		int answer = -1;
		int min = Integer.MAX_VALUE;



		for (int i = 0 ; i < wires.length ; i++){
			visit = new boolean[n+1];
			visit[wires[0][0]] = true;
			int num = dfs(i,0,wires,wires[0][0]);
			System.out.println(num);
			int abs = n - num;
			min = Math.min(min,Math.abs(num-abs));

		}

		System.out.println(min);



		return answer;
	}

	public int dfs(int index, int depth, int[][] wires,int start){


		for (int i = 0 ; i < wires.length ; i++){

			if (i == index){
				continue;
			}

			if (start == wires[i][0] && visit[wires[i][1]] == false){
				visit[wires[i][1]] = true;
				depth = dfs(index,depth+1,wires,wires[i][1]);
			}




		}

		return depth;
	}


}