package com.example.codingtest.programmers;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class Solution024Test {

	@Test
	void sol() throws ParseException {

		Solution024 solution = new Solution024();


		String[] participant = new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
		// String[] completion = new String[]{1, 1, 9, 1, 1, 1};

		solution.solution(participant);

		//assertThat(solution.sol(), is(2));

	}
}