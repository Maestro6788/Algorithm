package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution023Test {

	@Test
	void sol() {

		Solution023 solution = new Solution023();


		String[][] participant = new String[][]{{"홍콩", "11AM", "9AM"}, {"엘에이", "11PM", "9AM"} };
		// String[] completion = new String[]{1, 1, 9, 1, 1, 1};

		solution.solution(3.5,participant);

		//assertThat(solution.sol(), is(2));

	}
}