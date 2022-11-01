package com.mokshesh.cp.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class ChristmasTreesTest {
  private static ChristmasTrees christmasTrees;

  @BeforeAll
  static void setUp() {
    christmasTrees = new ChristmasTrees();
  }

  private static Stream<Arguments> generateData() {
    return Stream.of(
      arguments(new int[]{1, 3, 5}, new int[]{1, 2, 3}, 6),
      arguments(new int[]{1, 6, 4, 2, 6, 9}, new int[]{2, 5, 7, 3, 2, 7}, 7)
    );
  }


  @ParameterizedTest
  @MethodSource("generateData")
  void solve(int[] height, int[] cost, int expectResult) {
    Assertions.assertThat(christmasTrees.solve(height, cost))
      .isEqualTo(expectResult);
  }
}
