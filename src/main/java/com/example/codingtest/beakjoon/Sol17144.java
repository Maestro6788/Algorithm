package com.example.codingtest.beakjoon;

public class Sol17144 {

	private static int dx[] = {0,0,1,-1};
	private static int dy[] = {1,-1,0,0};

	public int sol(String[][] args) {
		System.out.println("========================================");

		// 1. 정보 세팅
		int height = Integer.parseInt(args[0][0]);
		int depth = Integer.parseInt(args[0][1]);
		int time = Integer.parseInt(args[0][2]);
		int upLocation = 0;
		int downLocation = 0 ;


		// 배열 세팅 (공기 청정기)
		int[][] upCheck = new int[height][depth];
		int[][] downCheck = new int[height][depth];



		// 2. 배열 세팅
		int[][] map = new int[7][8];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				map[i][j] = Integer.parseInt(args[i + 1][j]);

				if (map[i][j] == -1 && upLocation!=0){
					downLocation = i;
				}

				if(map[i][j] == -1 && downLocation == 0){
					upLocation = i;
				}
			}
		}


		// 순환고리
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				if (i == 0 || i == upLocation  ){
					upCheck[i][j] = 1;
				}
				else{
					if(i <= upLocation && (j==0 || j == depth-1)){
						upCheck[i][j] = 1;
					}
				}

				if (i ==downLocation || i == height-1 ){
					downCheck[i][j] = 1;
				}
				else{
					if(i >= downLocation && (j==0 || j == depth-1)){
						downCheck[i][j] = 1;
					}
				}


			}
		}
		// 공기청정기 자리 순한고리에서 제고
		upCheck[upLocation][0]=0;
		downCheck[downLocation][0]=0;


		// 3. 확산량, 잔여량 계산 dfs
		int[][] remain = new int[7][8];
		int[][] spread = new int[7][8];
		int[][] count = new int[7][8];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				spread[i][j] = map[i][j] / 5;
				dfs(map, count, i, j);
				remain[i][j] = map[i][j] - (spread[i][j] * count[i][j]);
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				int allSpread = 0;
				allSpread = allSpreadBfs(map, spread, i, j, allSpread);
				map[i][j] = remain[i][j] + allSpread;
			}
		}



		map = upBfs(map,upCheck,upLocation,1,0,upLocation);
		map = downBfs(map,downCheck,downLocation,1,0,downLocation);


		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		int answer = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < depth; j++) {
				answer += map[i][j];
			}
		}





		return answer+2;
	}
	public int[][] upBfs(int[][] map, int[][] upCheck, int x, int y,int nextValue,int upLocation){
		upCheck[x][y]=0;


		int nowValue = map[x][y];

		for(int i=0; i<4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 0 && nx < 7 && ny < 8){
				if(upCheck[nx][ny] == 1){
					map[x][y]= nextValue;
					upBfs(map, upCheck, nx,ny,nowValue,upLocation);
				}
			}
		}

		return map;
	}

	public int[][] downBfs(int[][] map, int[][] downCheck, int x, int y,int nextValue,int downLocation){
		downCheck[x][y]=0;


		int nowValue = map[x][y];

		for(int i=0; i<4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 0 && nx < 7 && ny < 8){
				if(downCheck[nx][ny] == 1){
					map[x][y]= nextValue;
					downBfs(map, downCheck, nx,ny,nowValue,downLocation);
				}
			}
		}

		return map;
	}

	public void dfs(int[][] map, int[][] count, int i, int j) {

		//값이 없다면 바로 반환
		if (map[i][j] == 0 || map[i][j] == -1) {
			return;
		}

		// 4방향 중 배열 	범위 && 공기 청정기가 없다면 카운트!
		if (i + 1 >= 0 && i + 1 < 7 && j >= 0 && j < 8) {
			if (map[i + 1][j] == 0 || map[i + 1][j] >= 0) {
				count[i][j]++;
			}
		}

		if (i - 1 >= 0 && i - 1 < 7 && j >= 0 && j < 8) {
			if (map[i - 1][j] == 0 || map[i - 1][j] >= 0) {
				count[i][j]++;
			}
		}

		if (i >= 0 && i < 7 && j + 1 >= 0 && j + 1 < 8) {
			if (map[i][j + 1] == 0 || map[i][j + 1] >= 0) {
				count[i][j]++;
			}
		}

		if (i >= 0 && i < 7 && j - 1 >= 0 && j - 1 < 8) {
			if (map[i][j - 1] == 0 || map[i][j - 1] >= 0) {
				count[i][j]++;
			}
		}
	}

	public int allSpreadBfs(int[][] map, int[][] spread, int i, int j, int allSpread) {

		if(map[i][j] == -1){
			allSpread = 0;
			return allSpread;
		}

		// 4방향 중 배열 	범위 && 공기 청정기가 없다면 카운트!
		if (i + 1 >= 0 && i + 1 < 7 && j >= 0 && j < 8) {
			if (spread[i + 1][j] >= 0) {
				allSpread += spread[i + 1][j];
			}
		}

		if (i - 1 >= 0 && i - 1 < 7 && j >= 0 && j < 8) {
			if (spread[i - 1][j] >= 0) {
				allSpread += spread[i - 1][j];
			}
		}

		if (i >= 0 && i < 7 && j + 1 >= 0 && j + 1 < 8) {
			if (spread[i][j + 1] >= 0) {
				allSpread += spread[i][j + 1];
			}
		}

		if (i >= 0 && i < 7 && j - 1 >= 0 && j - 1 < 8) {
			if (spread[i][j - 1] >= 0) {
				allSpread += spread[i][j - 1];
			}
		}

		return allSpread;
	}

}
