package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionTest {

	@Test
	void sol() {

		Ebay002 solution = new Ebay002();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		int[] completion = new int[]{1, 3, 2};

		solution.solution(completion,3);

		//assertThat(solution.sol(), is(2));

	}
}