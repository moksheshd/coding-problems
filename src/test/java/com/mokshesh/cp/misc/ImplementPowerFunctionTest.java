package com.mokshesh.cp.misc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ImplementPowerFunctionTest {
  private static ImplementPowerFunction implementPowerFunction;

  @BeforeAll
  static void setUp() {
    implementPowerFunction = new ImplementPowerFunction();
  }

  @Test
  void pow() {
    int a = 2;
    int b = 3;
    int mod = 3;
    assertThat(implementPowerFunction.pow(a, b, mod))
      .isEqualTo(2);
  }

  @Test
  void pow1() {
    int a = 0;
    int b = 0;
    int mod = 3;
    assertThat(implementPowerFunction.pow(a, b, mod))
      .isEqualTo(0);
  }

  @Test
  void pow2() {
    int a = -1;
    int b = 1;
    int mod = 20;
    assertThat(implementPowerFunction.pow(a, b, mod))
      .isEqualTo(19);
  }
}
