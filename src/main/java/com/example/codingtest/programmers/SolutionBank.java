package com.example.codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

class SolutionBank {

	public class Bank{
		int wait;
		int time;
		public Bank(int wait, int time){
			this.wait = wait;
			this.time = time;
		}

		public void timing(){
			time--;
		}

		@Override
		public String toString() {
			return "Bank{" +
				"wait=" + wait +
				", time=" + time +
				'}';
		}

	}

	public int solution(int[] participant, int[] completion) {
		int answer = 0;
		int counter = 0;
		Queue<Bank> q = new LinkedList<>();
		Queue<Bank> waitQ = new LinkedList<>();

		for (int i = 0 ; i < participant.length ; i++){
			q.offer(new Bank(participant[i],completion[i]));
		}

		int waitNum = 0;

		while(!q.isEmpty() || !waitQ.isEmpty()){

			// 대기 시간이 같다면
			if (!q.isEmpty()){
				if (q.peek().wait <= waitNum){

					// 대기석이 2이상
					if (counter >= 2){
						answer++;
					}
					// 대기석이 2이하
					else{
						if (counter < 2){
							waitQ.offer(q.poll());
							counter++;

						}
					}

				}
			}


			System.out.println(waitQ);

			// 시간 감소
			if (!waitQ.isEmpty()){
				for (Bank bank : waitQ){
					bank.timing();
				}
			}


			// 시간 끝난 사람 대기열에서 제외
			for (int i = 0 ; i < waitQ.size() ; i++){
				Bank bank = waitQ.poll();
				if (bank.time > 0){
					waitQ.offer(bank);

				}
				if (bank.time == 0){
					counter--;
				}
			}

			waitNum++;

		}

		System.out.println( answer);


		return answer;
	}
}