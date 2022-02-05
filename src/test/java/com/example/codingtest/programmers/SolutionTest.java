package com.example.codingtest.programmers;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void sol() {

		NTS001 solution = new NTS001();

		solution.changeConvection("thisIsLongVariableName");
		solution.changeConvection("this_is_long_variable_name");
	}
}

//thisislongvariablename