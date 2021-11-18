package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionCoffeeTest {

	@Test
	void sol() {

		SolutionCoffee solution = new SolutionCoffee();



		int[] participant = new int[]{4,2,2,5,3};


		solution.solution(participant);
		//assertThat(solution.sol(), is(2));

	}
}