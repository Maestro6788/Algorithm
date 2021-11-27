package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution040 {

	public class Info {
		String sale;
		int price;
		int count;

		public Info(String sale, int price, int count) {
			this.sale = sale;
			this.price = price;
			this.count = count;
		}
	}

	public class last{

		int price;
		int count;

		public last(int price, int count) {
			this.price = price;
			this.count = count;
		}
		public void timing(int late){
			count = count - late;
		}
	}


	public int[] solution(String[] record) {
		int[] answer = new int[2];
		String[] str = new String[3];
		List<Info> list = new ArrayList<>();
		List<Integer> countArr = new ArrayList<>();

		for (int i = 0; i < record.length; i++) {
			str = record[i].split(" ");
			list.add(new Info(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2])));

		}

		// 선입 선출
		int sum = 0;
		int count = 0;
		int countSize = list.get(0).count;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).sale.equals("S")) {

				int size = list.get(i).count;

				while (size > 0) {

					if (list.get(countArr.get(count)).sale.equals("P")) {
						if (size >= list.get(countArr.get(count)).count) {
							sum += (list.get(countArr.get(count)).price * list.get(countArr.get(count)).count);
							size -= list.get(countArr.get(count)).count;
							count++;

							countSize = list.get(countArr.get(count)).count;

						}

						if (size < list.get(countArr.get(count)).count && countSize > size) {
							sum += (list.get(countArr.get(count)).price * size);
							countSize = list.get(countArr.get(count)).count - size;
							size = 0;
						}

						if (size < list.get(countArr.get(count)).count && countSize <= size) {
							sum += (list.get(countArr.get(count)).price * countSize);
							count++;
							sum += (list.get(countArr.get(count)).price * (size - countSize));
							countSize = list.get(countArr.get(count)).count - (size - countSize);

							size = 0;
						}

					} else {
						count++;
					}

				}

			} else {
				countArr.add(i);
			}
		}


		int sum2= 0;
		int size = 0;
		count = 0;
		int point= -1;

		boolean flag =false;
		List<last> arr = new ArrayList<>();

		// 선입 후출
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).sale.equals("S")) {

				size = list.get(i).count;
				count = point;
				while(size > 0){

					if (arr.get(count).count >= size ){
						sum2 += (size*arr.get(count).price);
						arr.get(count).timing(size);
						size =0;
					}


					if (arr.get(count).count < size){
						sum2 += (arr.get(count).count *arr.get(count).price);
						size -= arr.get(count).count;
						arr.get(count).timing(arr.get(count).count);
						count--;
					}






				}
			}
			else{
				arr.add(new last(list.get(i).price, list.get(i).count));
				point++;
			}
		}

		answer[0] = sum;
		answer[1] = sum2;
		return answer;
	}
}