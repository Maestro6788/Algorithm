package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution030Test {

	@Test
	void sol() {

		Solution030 solution = new Solution030();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		String[] completion = new String[]{"A","MAN","DRINK","WATER11"};

		solution.solution(completion,false);

		//assertThat(solution.sol(), is(2));

	}
}