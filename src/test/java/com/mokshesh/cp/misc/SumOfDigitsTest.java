package com.mokshesh.cp.misc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfDigitsTest {
  private static SumOfDigits sumOfDigits;

  @BeforeAll
  static void setUp() {
    sumOfDigits = new SumOfDigits();
  }

  @Test
  void solve() {
    int a = 123;
    assertThat(sumOfDigits.solve(a)).isEqualTo(6);
  }

  @Test
  void solve1() {
    int a = 46;
    assertThat(sumOfDigits.solve(a)).isEqualTo(10);
  }

  @Test
  void solve2() {
    int a = 11;
    assertThat(sumOfDigits.solve(a)).isEqualTo(2);
  }
}
