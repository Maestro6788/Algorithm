package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void sol() {

		Line002 solution = new Line002();


		// String[] participant = new String[]{"P 100 4", "P 300 9", "S 1000 7", "P 1000 8", "S 700 7", "S 700 3"};
		//int[][] completion = new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};

		int[] completion = new int[]{0, 1, 2, 5, 3, 7};


		//solution.solution("}]()[{");
		//solution.solution("3people unFollowed me");
		solution.solution(completion);



		//assertThat(solution.sol(), is(2));

	}
}