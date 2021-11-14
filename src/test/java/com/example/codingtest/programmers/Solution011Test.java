package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution011Test {

	@Test
	void sol() {

		Solution011 solution = new Solution011();


		int[] participant = new int[]{93, 30, 55};
		int[] completion = new int[]{1, 30,5};

		solution.solution(participant,completion);

		//assertThat(solution.sol(), is(2));

	}
}