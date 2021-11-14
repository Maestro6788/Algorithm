package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

class PrinterTest {

	@Test
	void sol() {

		Printer solution = new Printer();


		int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
		int location = 0;

		solution.solution(priorities,location);

		//assertThat(solution.sol(), is(2));

	}
}