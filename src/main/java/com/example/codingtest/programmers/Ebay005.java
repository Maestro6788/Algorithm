// package com.example.codingtest.programmers;
//
// import java.util.HashMap;
//
// class Ebay005 {
//
// 	public class Info{
// 		String str;
// 		int index;
//
// 		public Info(String str, int index) {
// 			this.str = str;
// 			this.index = index;
// 		}
// 	}
//
// 	public static boolean[] visit;
//
// 	public String[] solution(String []P) {
// 		String[] answer = new String[2];
// 		visit = new boolean[P.length];
//
// 		dfs(P);
//
//
//
//
// 		return answer;
// 	}
//
// 	public void dfs(String[] P, int depth, int idx){
//
// 		if (depth == 2){
//
//
//
//
// 		}
//
//
// 		for (int i = idx ; i < P.length ; i++){
//
// 			if (visit[i] == false){
//
// 				visit[i] = true;
//
// 				dfs(P,depth+1, i);
//
// 				visit[i] = false;
//
//
//
// 			}
//
//
// 		}
//
//
//
// 	}
//
// }