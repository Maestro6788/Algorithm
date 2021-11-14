package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

class Sol001Test {

	@Test
	void sol() {

		Sol001 solution = new Sol001();


		String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
		String[] completion = new String[]{"stanko", "ana", "mislav"};

		solution.solution(participant,completion);

		//assertThat(solution.sol(), is(2));

	}
}