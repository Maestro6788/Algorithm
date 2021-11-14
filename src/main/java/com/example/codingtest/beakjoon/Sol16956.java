// package com.example.codingtest.beakjoon;
//
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
//
// import org.springframework.boot.autoconfigure.web.ServerProperties;
//
// public class Sol16956 {
//
// 	public static String[][] arr;
// 	public static int PX ;
// 	public static int PY;
// 	public static boolean[][] visit;
// 	public static int[] dx={1,-1,0,0};
// 	public static int[] dy={0,0,1,-1};
//
// 	public class Point{
// 		int x;
// 		int y;
//
// 		public Point(int x, int y){
// 			this.x = x;
// 			this.y = y;
// 		}
//
// 		@Override
// 		public String toString() {
// 			return "Point{" +
// 				"x=" + x +
// 				", y=" + y +
// 				'}';
// 		}
// 	}
//
// 	public int sol() {
//
// 		List<Point> wolf = new ArrayList<>();
//
// 		PX=6;
// 		PY=6;
// //S양 W늑대
//
// 		visit = new boolean[PX][PY];
//
// 		arr = new String[][]{
// 			{".",".","S",".",".","."},
// 			{".",".","S",".","W","."},
// 			{".","S",".",".",".","."},
// 			{".",".","W",".",".","."},
// 			{".",".",".","W",".","."},
// 			{".",".",".",".",".","."}
// 		};
//
//
// 		for (int i = 0 ; i < PX ; i++){
// 			for (int j = 0 ; j < PY ; j++){
//
// 				if (arr[i][j].equals("W")) {
//
// 					wolf.add(new Point(i,j));
//
// 					for (int k = 0; k < 4; k++) {
// 						int nx = i + dx[k];
// 						int ny = j + dy[k];
//
// 						if (arr[nx][ny].equals(".")) {
// 							arr[nx][ny] = "D";
// 						}
// 						else if (arr[nx][ny].equals("S")){
// 							return 0;
// 						}
// 					}
// 				}
//
// 			}
//
// 		}
//
// 		bfs(wolf);
//
// 	}
//
// 	public void bfs(List<Point> wolf) {
//
// 		Queue<Point> q = new LinkedList<>();
//
// 		for (Point p : wolf){
// 			q.offer(p);
// 			visit[p.x][p.y] = true;
// 		}
//
// 		while(!q.isEmpty()){
//
// 			Point p = q.poll();
//
// 			int x = p.x;
// 			int y = p.y;
//
// 			for (int i =0 ; i < 4 ; i++){
//
// 				int nx = x + dx[i];
// 				int ny = y + dy[i];
//
// 				if ( nx >= 0 && ny >= 0 && nx < PX && ny < PY){
//
// 					// if (visit[nx][ny] == false && )
//
// 				}
//
//
// 			}
//
//
// 		}
//
//
//
//
//
//
// 	}
// }
