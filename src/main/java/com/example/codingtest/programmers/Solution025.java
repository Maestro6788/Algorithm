package com.example.codingtest.programmers;

class Solution025 {

	public static int[][] answer;
	public static int[][] result;
	public static int xSize;
	public static int ySize;

	public int[][] solution(int rows, int columns) {

		answer = new int[rows][columns];
		result = new int[rows][columns];

		xSize = rows;
		ySize = columns;

		dfs(0,0,0,1);


		for (int i = 0 ; i < xSize ; i++){
			for (int j = 0 ; j < ySize; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

		return result;
	}

	public void dfs(int x, int y, int count, int depth){

		if (count == xSize*ySize){
			return;
		}

		answer[x][y] = depth;


		int nx = 0;
		int ny = 0;

		if (depth % 2 ==1){
			nx = x;
			ny = y+1;

			if (ny == ySize){
				ny -= ySize;
			}

		}
		else{
			nx = x+1;
			ny = y;

			if (nx == xSize){
				nx -= xSize;
			}
		}

		if(answer[nx][ny] == 0){
			for (int i = 0 ; i < xSize ; i++){
				for (int j = 0 ; j < ySize; j++){
					result[i][j] = answer[i][j];
				}
			}
			result[nx][ny] = depth+1;

			dfs(nx,ny,0,depth+1);
		}
		else{
			dfs(nx,ny,count+1,depth+1);
		}

	}
}