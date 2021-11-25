package com.example.codingtest.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Sort {

	// 정렬이 없번 일어 났는지 계산산
	public void operate() {

		int[] map = new int[] {1, 6, 3, 4, 7};
		Map<String,Integer> hash = new HashMap<>();

		String[] nums = new String[map.length];

		for (int i=0; i<nums.length; i++)
			nums[i] = map[i] + "";

		Arrays.sort(nums, new Comparator<String>() {
			public int compare(String o1, String o2) {

				System.out.print("o1 : " + o1 + " ");
				System.out.println("o2 : " + o2);

				System.out.println((o1 + o2).compareTo(o2 + o1) );
				if ((o1 + o2).compareTo(o2 + o1) <= -1){
					hash.put(o1,hash.getOrDefault(o1,0)+1);
					hash.put(o2,hash.getOrDefault(o2,0)+1);
				}


				return (o1 + o2).compareTo(o2 + o1);
			}
		});

		System.out.println(hash);

	}
}
