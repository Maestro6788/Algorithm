package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

class Solution003Test {

	@Test
	void sol() {

		Solution003 solution = new Solution003();


		int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
		int[][] commands= new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		solution.solution(array,commands);

		//assertThat(solution.sol(), is(2));

	}
}