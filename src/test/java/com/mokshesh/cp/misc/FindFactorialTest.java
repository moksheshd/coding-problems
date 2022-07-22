package com.mokshesh.cp.misc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FindFactorialTest {
  static FindFactorial findFactorial;

  @BeforeAll
  static void setUp() {
    findFactorial = new FindFactorial();
  }

  @Test
  void solve() {
    int n = 1;
    Assertions.assertThat(findFactorial.solve(n))
      .isEqualTo(1);
  }

  @Test
  void solve1() {
    int n = 4;
    Assertions.assertThat(findFactorial.solve(n))
      .isEqualTo(24);
  }

  @Test
  void solve2() {
    int n = 0;
    Assertions.assertThat(findFactorial.solve(n))
      .isEqualTo(1);
  }
}
