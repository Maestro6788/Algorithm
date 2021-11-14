package com.example.codingtest.programmers;

class Solution023 {
	public String solution(double time, String[][] plans) {
		String answer = "";

		for (int i = 0 ; i < plans.length ; i++){
			double start = Integer.parseInt(plans[i][1].substring(0,plans[i][1].length()-2));
			start = start + 12.0;

			if (plans[i][1].substring(plans[i][1].length()-2,plans[i][1].length()).equals("AM")){
				continue;
			}

			double end = Integer.parseInt(plans[i][2].substring(0,plans[i][2].length()-2));
			if (plans[i][2].substring(plans[i][2].length()-2,plans[i][2].length()).equals("PM")){
				end = end +12.0;
			}


			double total = 0;

			if (start < 18){
				total = total + (18.0 - start);
			}
			if (end > 13){
				total = total + (end - 13.0);
			}

			if (total <= time ){
				answer = plans[i][0];
			}
			else{
				break;
			}

		}

		return answer;
	}
}