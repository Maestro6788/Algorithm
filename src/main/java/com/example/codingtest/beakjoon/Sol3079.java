package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sol3079 {

	public static class Info{
		int all;
		int time;

		public Info(int all,int time){
			this.all = all;
			this.time = time;
		}

		public void timing(){
			time--;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken()); // 창구수
		int num = Integer.parseInt(st.nextToken()); // 대기인원
		int[] arr = new int[size];

		for(int i = 0 ; i < num ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		Queue<Info> queue = new LinkedList<>();
		queue.offer(new Info(arr[0], arr[0]));
		queue.offer(new Info(arr[1], arr[1]));

		int nowCounter = 2;
		int nowSize = 2; //현재 인원
		int allTime = 0;

		while (!queue.isEmpty()){

			int queueSize = queue.size();
			for (int i = 0 ; i < queueSize ; i++){
				Info f = queue.poll();
				if (f.time > 0){
					queue.offer(f);
					f.timing();
					continue;
				}

				if (f.time == 0 && nowSize == num-1){
					nowSize++;
					int min = Integer.MAX_VALUE;
					int lastTime = arr[(nowCounter-1)%size];
					for (int j = 0 ; j < queue.size() ; j++){
						Info info = queue.poll();
						min = Math.min(min,info.all + info.time);
					}

					if (min < lastTime){
						queue.offer(new Info(0,min));
					}
					else{
						queue.offer(new Info(arr[(nowCounter-1)%size],arr[(nowCounter-1)%size]));
					}

				}

				if (f.time == 0 && nowSize <= num ){
					nowSize++;
					queue.offer(new Info(arr[(nowCounter-1)%size],arr[(nowCounter-1)%size]));
				}

			}


			allTime++;

		}




	}

}
