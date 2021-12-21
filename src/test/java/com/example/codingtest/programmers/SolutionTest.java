package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionTest {

	@Test
	void sol() {

		Solution042 solution = new Solution042();


		// String[] participant = new String[]{1, 1, 9, 1, 1, 1};
		int[][] completion = new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

		solution.solution(9,completion);

		//assertThat(solution.sol(), is(2));

	}
}