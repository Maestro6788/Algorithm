package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution007Test {

	@Test
	void sol() {

		Solution007 solution = new Solution007();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		int[] completion = new int[]{2,1,3,4,1};

		solution.solution(completion);

		//assertThat(solution.sol(), is(2));

	}
}