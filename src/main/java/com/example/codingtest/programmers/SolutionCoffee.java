package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class SolutionCoffee {

	public class Coffee{
		int point;
		int time;

		public Coffee(int point, int time){
			this.point = point;
			this.time = time;
		}

		public void timing(){
			time--;
		}


		@Override
		public String toString() {
			return "Coffee{" +
				"point=" + point +
				", time=" + time +
				'}';
		}
	}

	public static int N;

	public int solution(int[] participant) {
		int answer = 0;
		int counter = 0;
		N =3;

		Queue<Coffee> queue = new LinkedList<>();
		Queue<Coffee> waitQ = new LinkedList<>();
		List<Integer> answerList = new ArrayList<>();
		for (int i = 0 ; i < participant.length ; i++){
			queue.offer(new Coffee(i,participant[i]));
		}

		while (!queue.isEmpty() || !waitQ.isEmpty()){

			while(counter < N){
				Coffee coffee = queue.poll();
				waitQ.offer(coffee);
				counter++;
			}
			//System.out.println(waitQ);

			if (!waitQ.isEmpty()){
				for (Coffee coffee : waitQ){
					coffee.timing();
				}
			}


			List<Integer> list = new ArrayList<>();
			for (int i = 0 ; i < waitQ.size() ; i++){
				if (!waitQ.isEmpty()){
					Coffee coffee = waitQ.poll();
					if (coffee.time > 0 ){
						waitQ.offer(coffee);
						System.out.println(coffee);
					}
					if (coffee.time == 0 ){
						list.add(coffee.point);
						counter--;
					}
				}


			}
			Collections.sort(list);

			for (int i : list){
				answerList.add(i);
			}



		}

		System.out.println(answerList);





		return answer;
	}
}