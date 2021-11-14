package com.example.codingtest.beakjoon;

public class Sol2980 {

	public static int[][] arr;
	public static boolean[] visit;

	public static int N = 4;
	public static int length = 30;

	public void sol() {

		int now_location = 0;
		int now_time = 0;

		arr = new int[][]{{7,13,5},{14,4,4},{15,3,10},{25,1,1}};

		while(now_location < length){
			for(int i = 0 ; i < N ; i++){
				// 신호등 위치 파악
				if(arr[i][0] == now_time){
					// 신호등 색깔 파악
					int flag = 0;

					int tmp_time = now_time;
					while (tmp_time > 0){
						if (flag == 0){
							tmp_time -= arr[i][1];
							flag = 1;
							break;
						}

						if (flag == 1){
							tmp_time -= arr[i][2];
							flag = 0;
							break;
						}

					}


					//빨간 신호등 기다리기
					if (flag == 1){
						while (now_time - arr[i][1] < 0){
							now_time++;
						}
					}
				}
			}

			now_location++;
			now_time++;
		}

		System.out.println(now_time);

	}


}
