package com.example.codingtest.programmers;
// 라인 - 1번 문제
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Line001 {

	public class Info{
		String sale;
		int price;
		int num;

		public Info (String sale,int price, int num){
			this.sale = sale;
			this.price = price;
			this.num = num;
		}

		public void timing(int n){
			num -= n;
		}

	}


	public int[] solution(String[] record) {
		int[] answer = new int[2];

		String[][] arr = new String[record.length][3];

		for (int i = 0 ; i  < arr.length ; i++){
			arr[i] = record[i].split(" ");
		}


		// 선입 선출 (큐)
		Queue<Info> queue = new LinkedList<>();
		for (int i = 0 ; i  < arr.length ; i++){

			// 매입은 큐에 저장
			if (arr[i][0].equals("P")){
				queue.offer(new Info(arr[i][0],Integer.parseInt(arr[i][1]),Integer.parseInt(arr[i][2])));
				continue;
			}

			// 매출은 계산
			if (arr[i][0].equals("S")){
				int num =Integer.parseInt(arr[i][2]);

				while( num> 0){

					if (num >= queue.peek().num ){
						Info f = queue.poll();
						answer[0] += f.num * f.price;
						num -= f.num;
					}

					if (num > 0 && num < queue.peek().num){

						Info f = queue.peek();
						f.timing(num);
						answer[0] += num * f.price;
						num = 0;
					}

				}


			}
		}


		// 선입후출 (스택택)

		Stack<Info> stack = new Stack<>();
		for (int i = 0 ; i  < arr.length ; i++){

			// 매입은 큐에 저장
			if (arr[i][0].equals("P")){
				stack.add(new Info(arr[i][0],Integer.parseInt(arr[i][1]),Integer.parseInt(arr[i][2])));
				continue;
			}

			// 매출은 계산
			if (arr[i][0].equals("S")){
				int num =Integer.parseInt(arr[i][2]);

				while( num> 0){

					if (num >= stack.peek().num ){
						Info f = stack.pop();
						answer[1] += f.num * f.price;
						num -= f.num;
					}

					if (num > 0 && num < stack.peek().num){

						Info f = stack.peek();
						f.timing(num);
						answer[1] += num * f.price;
						num = 0;
					}

				}


			}
		}

		System.out.println(answer[0]);
		System.out.println(answer[1]);


		return answer;
	}
}