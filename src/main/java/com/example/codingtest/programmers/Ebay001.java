package com.example.codingtest.programmers;

import java.util.HashMap;



class Ebay001 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String,Integer> map = new HashMap<>();

		for (int i =0; i < participant.length ; i++){
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}

		System.out.println(map);

		for (int i =0; i < completion.length ; i++){
			map.put(completion[i], map.get(completion[i]) - 1);
		}


		System.out.println(map);

		for (String key : map.keySet()) {
			if (map.get(key) != 0){
				answer = key;
			}
		}

		System.out.println(answer);
		return answer;
	}
}