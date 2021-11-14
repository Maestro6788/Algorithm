package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution004Test {

	@Test
	void sol() {

		Solution004 solution = new Solution004();

		int n = 5;
		int[] participant = new int[]{2,4};
		int[] completion = new int[]{1,3,5};

		solution.solution(n,participant,completion);

		//assertThat(solution.sol(), is(2));

	}
}