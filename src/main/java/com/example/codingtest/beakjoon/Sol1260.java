package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol1260 {

	public static int n; //정점 개수
	public static int m; //간선의 수
	public static int v; //정점 탐색 시작
	public static int[][] map;
	public static boolean[] visit;
	public static boolean[] bfsvisit;
	public static List<Integer> list;
	public static List<Integer> bfslist;




	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[m][2];
		visit = new boolean[n+1];
		bfsvisit = new boolean[n+1];

		list = new ArrayList<>();
		bfslist = new ArrayList<>();

		for(int i=0; i<m; i++){
			str = br.readLine();
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[i][0]=a;
			map[i][1]=b;
		}

		Arrays.sort(map, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0] ){
					return o1[1] - o2[1];
				}
				return 0;
			}
		});



		for (int i = 0 ; i < m ; i++){
			if (map[i][0] == v){
				visit[map[i][0]] = true;
				list.add(map[i][0]);

				bfsvisit[map[i][0]] = true;
				bfslist.add(map[i][0]);


				dfs(map[i][0]);
				bfs(map[i][0]);
				break;
			}
			if (map[i][1] == v){
				visit[map[i][1]] = true;
				list.add(map[i][1]);

				bfsvisit[map[i][1]] = true;
				bfslist.add(map[i][1]);


				dfs(map[i][1]);
				bfs(map[i][1]);
				break;
			}

		}

		for (int i = 0 ; i < list.size() ; i++){
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		for (int i = 0 ; i < bfslist.size() ; i++){
			System.out.print(bfslist.get(i)+ " ");
		}
	}

	public static void dfs(int start ){
		for (int i = 0 ; i < m ; i++){
			if (map[i][0] == start && visit[map[i][1]]== false ){
				visit[map[i][1]] = true;
				list.add(map[i][1]);
				dfs(map[i][1]);
			}
			else if (map[i][1] == start && visit[map[i][0]]== false  ){
				visit[map[i][0]] = true;
				list.add(map[i][0]);
				dfs(map[i][0]);
			}
		}
	}

	public static void bfs(int start ){

		Queue<Integer> queue= new LinkedList<>();
		queue.offer(start);

		while(!queue.isEmpty()){

			start = queue.poll();
			System.out.println(start);
			for (int i = 0 ; i < m ; i++){
				if (map[i][0] == start && bfsvisit[map[i][1]]== false){
					bfsvisit[map[i][1]] = true;
					bfslist.add(map[i][1]);
					queue.offer(map[i][1]);
				}
				else if (map[i][1] == start && bfsvisit[map[i][0]]== false){
					bfsvisit[map[i][0]] = true;
					bfslist.add(map[i][0]);
					queue.offer(map[i][0]);
				}
			}
		}

	}

}
