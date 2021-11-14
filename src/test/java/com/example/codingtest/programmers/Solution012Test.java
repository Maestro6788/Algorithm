package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution012Test {

	@Test
	void sol() {

		Solution012 solution = new Solution012();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		int[] completion = new int[]{1, 1, 9, 1, 1, 1};

		solution.solution(completion,0);

		//assertThat(solution.sol(), is(2));

	}
}