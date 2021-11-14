package com.example.codingtest.beakjoon;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.example.codingtest.beakjoon.Sol17144;

class Sol17144Test {

	@Test
	void main() {
		Sol17144 solution = new Sol17144();

		String[][] args =
			{{"7", "8", "1"},
				{"0", "0", "0", "0","0", "0", "0", "9"},
				{"0", "0" ,"0","0" ,"3" ,"0" ,"0" ,"8"},
				{"-1", "0" ,"5", "0", "0", "0" ,"22", "0"},
				{"-1", "8", "0" ,"0" ,"0","0" ,"0", "0"},
				{"0" ,"0" ,"0" ,"0" ,"0" ,"10", "43", "0"},
				{"0" ,"0" ,"5" ,"0","15", "0", "0", "0"},
				{"0" ,"0" ,"40" ,"0" ,"0" ,"0" ,"20" ,"0"}};

		assertThat(solution.sol(args), is(188));

	}
}