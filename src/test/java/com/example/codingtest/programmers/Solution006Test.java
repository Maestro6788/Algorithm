package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution006Test {

	@Test
	void sol() {

		Solution006 solution = new Solution006();


		int[] participant = new int[]{1, 3, 2, 5, 4};
		// String[] completion = new String[]{1, 1, 9, 1, 1, 1};

		solution.solution(participant,9);

		//assertThat(solution.sol(), is(2));

	}
}