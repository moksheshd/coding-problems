package com.mokshesh.cp.array.dimensional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("medium")
@Tag("array")
@Tag("2d-array")
class SumOfAllSubmatricesTest {
  private static SumOfAllSubmatrices sumOfAllSubmatrices;

  @BeforeAll
  static void setUp() {
    sumOfAllSubmatrices = new SumOfAllSubmatrices();
  }

  @Test
  void solve() {
    int[][] a = {{1, 1}, {1, 1}};
    Assertions.assertEquals(16, sumOfAllSubmatrices.solve(a));
  }
}