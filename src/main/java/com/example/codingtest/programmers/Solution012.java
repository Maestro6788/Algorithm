package com.example.codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

class Solution012 {
	public class Info{
		public int prior;
		public int location;

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

		Queue<Info> q = new LinkedList<>();

		for (int i = 0 ; i < priorities.length ; i++){
			q.offer(new Info(priorities[i],i));
		}

		while(!q.isEmpty()){

			Info first = q.poll();
			boolean flag = false;

			for (int i = 0 ; i < q.size(); i++ ){
				Info second = q.poll();
				if (first.prior >= second.prior){
					q.offer(second);
				}
				else{
					q.offer(second);
					flag = true;
				}
			}

			if (flag == true){
				q.offer(first);
			}
			else{
				answer++;
			}

			if (first.location == location && flag == false){
				break;
			}

		}


		return answer;
	}
}