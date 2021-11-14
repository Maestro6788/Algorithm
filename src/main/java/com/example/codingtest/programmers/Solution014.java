package com.example.codingtest.programmers;

import java.util.LinkedList;
import java.util.Queue;

class Solution014 {

	public class Bank{
		private int wait;
		private int time;

		public Bank(int wait, int time) {
			this.wait = wait;
			this.time = time;
		}

		public void timing(){
			time--;
		}

		public int getWait() {
			return wait;
		}

		public int getTime() {
			return time;
		}

		@Override
		public String toString() {
			return "Bank{" +
				"wait=" + wait +
				", time=" + time +
				'}';
		}
	}

	public int solution() {
		int answer = 0;
		int counter = 0;
		int count = 0;

		int[] a = new int[]{0,2,4,5};
		int[] b = new int[]{3,5,2,3};

		Queue<Bank> bankQueue = new LinkedList<>();
		Queue<Bank> waitQueue = new LinkedList<>();

		for (int i = 0 ; i < a.length ; i++){
			bankQueue.offer(new Bank(a[i],b[i]));
		}

		int businessHour = a[a.length-1]+ b[a.length-1];

		while(answer <= businessHour){
			System.out.println(answer + " " + waitQueue);
			if (!bankQueue.isEmpty()) {
				if (counter < 2 && bankQueue.peek().getWait() <= answer) {
					Bank info = bankQueue.poll();
					waitQueue.offer(info);
					counter++;
				}
				else if (counter == 2 &&  bankQueue.peek().getWait() > answer){
					System.out.println("---------------");

					count++;
					businessHour++;
				}
			}



			answer++;

			for (Bank bank : waitQueue){
				bank.timing();
			}

			for (int i = 0 ; i < waitQueue.size() ; i++){
				Bank bank = waitQueue.poll();
				if (bank.getTime() != -1){
					waitQueue.offer(bank);
				}
				else{
					counter--;
				}
			}


		}

		System.out.println(bankQueue);
		System.out.println(waitQueue);
		System.out.println(count);

		return answer;
	}
}