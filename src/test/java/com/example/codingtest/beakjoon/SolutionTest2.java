package com.example.codingtest.beakjoon;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.text.ParseException;
import org.junit.jupiter.api.Test;

import com.example.codingtest.beakjoon.Solution;

class SolutionTest2 {

  @Test
  void solution() throws ParseException {
    Solution solution = new Solution();

    String[] str = {
        "2016-09-15 20:59:57.421 0.351s",
        "2016-09-15 20:59:58.233 1.181s",
        "2016-09-15 20:59:58.299 0.8s",
        "2016-09-15 20:59:58.688 1.041s",
        "2016-09-15 20:59:59.591 1.412s",
        "2016-09-15 21:00:00.464 1.466s",
        "2016-09-15 21:00:00.741 1.581s",
        "2016-09-15 21:00:00.748 2.31s",
        "2016-09-15 21:00:00.966 0.381s",
        "2016-09-15 21:00:02.066 2.62s"
    };

    assertThat(solution.solution(str), is(7));

  }

  @Test
  void solution1() throws ParseException {
    Solution solution = new Solution();

    String[] str = {
        "2016-09-15 01:00:04.001 2.0s",
        "2016-09-15 01:00:07.000 2s"
    };

    assertThat(solution.solution(str), is(2));

  }
}