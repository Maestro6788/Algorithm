package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Printer {

	public class Info{
		int prior;
		int location;

		public Info(int prior, int location) {
			this.prior = prior;
			this.location = location;
		}


		public int getPrior() {
			return prior;
		}

		public int getLocation() {
			return location;
		}

		@Override
		public String toString() {
			return "Info{" +
				"prior=" + prior +
				", location=" + location +
				'}';
		}
	}

	public int solution(int[] priorities, int location) {
		int answer = 0;
		int count = 1;
		List<Info> list = new ArrayList<>();
		Queue<Info> queue = new LinkedList<>();

		for (int i = 0 ; i < priorities.length ; i++){
			Info inputInfo = new Info(priorities[i],i);
			queue.offer(inputInfo);
			list.add(inputInfo);
		}


		while(true){

			Info info = queue.poll();
			boolean flag = false;
			for (int i = 1 ; i < list.size() ; i++){
				if (info.getPrior() < list.get(i).getPrior()){
					flag = true;
				}
			}

			if (flag == true){
				// 실패
				queue.offer(info);
				Info listInfo = list.get(0);
				list.remove(0);
				list.add(listInfo);

			}
			else{
				// 성공
				if (info.getLocation() == location){
					System.out.println("정답 : " + count);
					return count;
				}

				count++;
				list.remove(0);




			}


		}

	}


}
