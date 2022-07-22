package com.mokshesh.cp.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindFibonacciIITest {

  private FindFibonacciII findFibonacciII = null;

  @BeforeEach
  void setUp() {
    findFibonacciII = new FindFibonacciII();
  }

  @Test
  void findAthFibonacci() {
    int a = 2;
    assertThat(findFibonacciII.findAthFibonacci(a)).isEqualTo(1);
  }

  @Test
  void findAthFibonacci1() {
    int a = 9;
    assertThat(findFibonacciII.findAthFibonacci(a)).isEqualTo(34);
  }
}