package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution009Test {

	@Test
	void sol() {

		Solution009 solution = new Solution009();


		int[] participant = new int[]{44, 1, 0, 0, 31, 25};
		int[] completion = new int[]{31, 10, 45, 1, 6, 19};

		solution.solution(participant,completion);

		//assertThat(solution.sol(), is(2));

	}
}