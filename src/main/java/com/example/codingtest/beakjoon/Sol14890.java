package com.example.codingtest.beakjoon;

public class Sol14890 {

	public static int[][] arr;
	public static boolean[] visit;

	public void sol() {
		int N = 6;
		arr = new int[][] {
			{3, 3, 3, 3, 3, 3},
			{2, 3, 3, 3, 3, 3},
			{2, 2, 2, 3, 2, 3},
			{1, 1, 1, 2, 2, 2},
			{1, 1, 1, 3, 3, 1},
			{1, 1, 2, 3, 3, 2}
		};

		int answer = 0;
		int arrCount = 0;
		for (int i =  0 ; i < N ; i++){
			boolean answerFlag = false;


			for (int j =  1 ; j < N ; j++){
				boolean arrFlag = false;
				if (Math.abs(arr[i][j] - arr[i][j-1]) > 1){
					break;
				}

				if (arrFlag == false && Math.abs(arr[i][j] - arr[i][j-1]) == 1 ){
					arrCount = 1;
					arrFlag = true;
				}

				if (arrFlag == true && arr[i][j] == arr[i][j-1] ){
					arrCount++;
				}

				if (arrFlag == true && arr[i][j] > arr[i][j-1] ){

					if (arrCount < 2){
						break;
					}


					arrCount = 1;
					arrFlag = false;
				}

				if (arrFlag == true && arr[i][j] < arr[i][j-1] ){
					if (arrCount < 2){
						break;
					}


					arrCount = 1;
					arrFlag = false;
				}

				answerFlag = true;
			}

			if (answerFlag == true){
				answer++;

			}

		}

		System.out.println(answer);

	}

	public void dfs(int N, int M, int depth) {

	}
}
