package com.mokshesh.cp.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SortedInsertPositionTest {
  private static SortedInsertPosition sortedInsertPosition;

  @BeforeAll
  static void setUp() {
    sortedInsertPosition = new SortedInsertPosition();
  }

  static Stream<Arguments> generateData() {
    return Stream.of(
      arguments(new int[]{1, 3, 5, 6}, 5, 2),
      arguments(new int[]{1, 3, 5, 6}, 2, 1),
      arguments(new int[]{1, 3, 5, 6}, 7, 4),
      arguments(new int[]{1, 3, 5, 6}, 7, 5)
    );
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void searchInsert(int[] nums, int target, int expectedResult) {
    assertThat(sortedInsertPosition.searchInsert(nums, target))
      .isEqualTo(expectedResult);
  }
}
