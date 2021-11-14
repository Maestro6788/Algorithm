package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution013Test {

	@Test
	void sol() {

		Solution013 solution = new Solution013();


		int[] participant = new int[]{7,4,5,6};
		// String[] completion = new String[]{1, 1, 9, 1, 1, 1};

		solution.solution(2,10,participant);

		//assertThat(solution.sol(), is(2));

	}
}