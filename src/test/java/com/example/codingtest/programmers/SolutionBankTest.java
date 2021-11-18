package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionBankTest {

	@Test
	void sol() {

		SolutionBank solution = new SolutionBank();


		 int[] participant = new int[]{0,2,4,5};
		 int[] completion = new int[]{3,5,2,3};

		solution.solution(participant,completion);

		//assertThat(solution.sol(), is(2));

	}
}