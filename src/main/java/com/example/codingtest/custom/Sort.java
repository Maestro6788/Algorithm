package com.example.codingtest.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Sort {

	public void operate(){

		Queue<Integer> list = new LinkedList<>();

		list.offer(1);
		list.offer(2);
		list.offer(3);
		list.offer(4);
		list.offer(5);
		list.offer(6);
		list.offer(7);

		List<Integer> answer = new ArrayList<>();

		while(!list.isEmpty()){

			for (int i = 0 ; i < 2 ; i++){

				int index = list.poll();
				list.offer(index);
			}

			answer.add(list.poll());
		}

		System.out.println(answer);




	}






}
