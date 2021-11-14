package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution021Test {

	@Test
	void sol() {

		Solution021 solution = new Solution021();


		String[] participant = new String[]{"r 10", "a 23", "t 124", "k 9"};
		String[] completion = new String[]{"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
		String[] c = new String[]{"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};

		solution.solution(participant,completion,c);

		//assertThat(solution.sol(), is(2));

	}
}