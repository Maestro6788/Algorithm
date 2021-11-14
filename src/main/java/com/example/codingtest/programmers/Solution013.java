package com.example.codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

/**
 * todo. programers 다리를지나는트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * 다시풀기
 */
class Solution013 {

	public class Truck{
		private int weight;
		private int move;

		public Truck(int weight, int move) {
			this.weight = weight;
			this.move = move;
		}

		public int getWeight() {
			return weight;
		}

		public int getMove() {
			return move;
		}

		public void setMove(int move) {
			this.move = move;
		}

		@Override
		public String toString() {
			return "Truck{" +
				"weight=" + weight +
				", move=" + move +
				'}';
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Truck> q = new LinkedList<>();
		Queue<Truck> b = new LinkedList<>();


		for (int i = 0 ; i < truck_weights.length ; i++){
			q.offer(new Truck(truck_weights[i], 0));
		}

		Truck info = q.poll();
		info.setMove(info.getMove()+1);
		b.offer(info);
		int count= 1;

		while(!q.isEmpty()){

			int totalWeight = 0;
			for (int i = 0; i < b.size() ; i++){
				Truck t = b.poll();
				totalWeight += t.getWeight();
				b.offer(t);
			}

			if (totalWeight + q.peek().getWeight() <= weight){
				Truck t = q.poll();
				t.setMove(t.getMove()+1);
				b.offer(t);
			}


		}




		return answer;
	}
}