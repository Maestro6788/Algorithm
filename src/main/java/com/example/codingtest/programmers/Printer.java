// package com.example.codingtest.programmers;
//
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
//
// public class Printer {
//
// 	public static int min;
//
// 	public int solution(int[][] arr) {
// 		min = Integer.MAX_VALUE;
// 		boolean[] visit = new boolean[4];
// 		backTracking(arr, 0, visit);
//
// 	}
//
// 	public void backTracking(int[][] arr, int depth, boolean[] visit) {
//
// 		// 배열이 원래상태이다
// 		if () {
// 			min = Math.min(min, depth);
// 			return;
// 		}
//
// 		for (int i = 0; i < 4; i++) {
//
// 			if (visit[i] == false) {
//
// 				visit[i] = true;
//
// 				// 위 아래 오른쪽 왼쪽 이동 로직
// 				// visit[1] = 오른쪽, visit[2] = 왼쪽 ,visit[3] = 아래 ...
// 				backTracking(arr, depth + 1, visit);
//
// 				// 위 아래 오른쪽 왼쪽 이동한거 다시 되돌리는 로직
// 				visit[i] = false;
//
// 			}
//
// 		}
//
// 	}
//
// }
