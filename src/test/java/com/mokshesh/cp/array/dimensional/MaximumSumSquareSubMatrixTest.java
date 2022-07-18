package com.mokshesh.cp.array.dimensional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumSquareSubMatrixTest {
  private static MaximumSumSquareSubMatrix maximumSumSquareSubMatrix;

  @BeforeEach
  void setUp() {
    maximumSumSquareSubMatrix = new MaximumSumSquareSubMatrix();
  }

  @Test
  void solve() {
    int[][] a = {
      {1, 1, 1, 1, 1},
      {2, 2, 2, 2, 2},
      {3, 8, 6, 7, 3},
      {4, 4, 4, 4, 4},
      {5, 5, 5, 5, 5}
    };
    int b = 3;
    Assertions.assertEquals(48, maximumSumSquareSubMatrix.solve(a, b));
  }

  @Test
  void solve2() {
    int[][] a = {
      {2, 2},
      {2, 2}
    };
    int b = 2;
    Assertions.assertEquals(8, maximumSumSquareSubMatrix.solve(a, b));
  }
}