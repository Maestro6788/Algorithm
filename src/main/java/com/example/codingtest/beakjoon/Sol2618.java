package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol2618 {

	public static class Point{
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
		}
	}

	public static List<Point> list;

	public static int[][] visit;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};

	public static void main(String[] args) throws IOException {

		// 입력 받는 과정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrSize = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());

		list = new ArrayList<>();
		visit = new int[arrSize][arrSize];

		for (int i =0; i< num ;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			list.add(new Point(x,y));
		}

		System.out.println(list);



	}


	public void bfs(int arrSize){

		Queue<Point> queue = new LinkedList<>();
		visit[0][0] = 1;
		visit[arrSize][arrSize] = 1;
		queue.offer(new Point(0,0));
		queue.offer(new Point(arrSize,arrSize));


		while(!queue.isEmpty()){
			Point p = queue.poll();

			for (int i = 0 ; i < 4 ;i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				for (int j = 0 ; j < list.size() ; j++){
					if (list.get(j).x == nx && list.get(j).y == ny){

						list.remove(j);




					}


				}

				if ( nx >= 0 && ny >=0 && nx < arrSize && ny < arrSize){

					if (visit[nx][ny] == 0){

						queue.offer(new Point(nx,ny));
						visit[nx][ny] = visit[p.x][p.y] +1 ;

					}
				}





			}





		}






	}


}
