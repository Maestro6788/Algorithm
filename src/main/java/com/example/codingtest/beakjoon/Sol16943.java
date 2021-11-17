package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

public class Sol16943 {

	public static int[] arr;
	public static boolean[] visit;
	public static int MAX ;

	public void sol() {

		List<String> list = new ArrayList<>();

		int target = 1000;
		int targetNum = 5;
		MAX = 0;
		while(target > 0){
			int index = target%10;
			list.add(String.valueOf(index));
			target /= 10;
		}
		visit = new boolean[list.size()];

		dfs(list,0,"",list.size(),targetNum);

		System.out.println(MAX);


	}

	public void dfs(List<String> list,int depth, String num, int Max,int targetNum) {

		if (Max == depth){

			if(Integer.parseInt(num) < targetNum){
				MAX = Math.max(Integer.parseInt(num),MAX);
			}

			//System.out.println(num);
			return;
		}


		for (int i = 0 ; i < Max; i++){
			if(num.equals("") && list.get(i).equals("0")){
				break;
			}

			if (visit[i] == false) {


				visit[i] = true;		// 해당 노드를 방문상태로 변경


				dfs(list,depth + 1, num + list.get(i) ,Max,targetNum);	// 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출

				// 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
				visit[i] = false;
			}

		}







	}
}
