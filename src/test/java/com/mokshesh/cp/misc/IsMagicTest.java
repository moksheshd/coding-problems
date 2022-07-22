package com.mokshesh.cp.misc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IsMagicTest {

  static IsMagic isMagic;

  @BeforeAll
  static void setUp() {
    isMagic = new IsMagic();
  }

  @Test
  void solve() {
    int a = 83557;
    Assertions.assertThat(isMagic.solve(a)).isEqualTo(1);
  }

  @Test
  void solve1() {
    int a = 1291;
    Assertions.assertThat(isMagic.solve(a)).isZero();
  }

  @Test
  void solveV2() {
    int a = 83557;
    Assertions.assertThat(isMagic.solveV2(a)).isEqualTo(1);
  }

  @Test
  void solveV2_1() {
    int a = 1291;
    Assertions.assertThat(isMagic.solveV2(a)).isZero();
  }
}
