package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionTest {

	@Test
	void sol() {

		Solution041 solution = new Solution041();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		int[] completion = new int[]{0, 1, 2, 5, 3, 7};

		solution.solution(completion);

		//assertThat(solution.sol(), is(2));

	}
}