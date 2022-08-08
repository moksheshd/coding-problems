package com.mokshesh.cp.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PeakElementTest {
  static PeakElement peakElement;

  @BeforeAll
  static void setUp() {
    peakElement = new PeakElement();
  }

  static Stream<Arguments> generateData() {
    return Stream.of(
      arguments(new int[]{1, 2, 3, 1}, List.of(3)),
      arguments(new int[]{1, 2, 1, 3, 5, 6, 4}, List.of(2, 6)),
      arguments(new int[]{1, 2, 3, 4, 5}, List.of(5)),
      arguments(new int[]{5, 17, 100, 11}, List.of(100)),
      arguments(new int[]{10, 20, 15, 2, 23, 90, 67}, List.of(20, 90)),
      arguments(new int[]{10, 20, 30, 40, 50}, List.of(50)),
      arguments(new int[]{100, 80, 60, 50, 20}, List.of(100))
    );
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void solveV1(int[] nums, List<Integer> expectedResult) {
    assertThat(expectedResult)
      .contains(peakElement.solveV1(nums));
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void solveV2(int[] nums, List<Integer> expectedResult) {
    assertThat(expectedResult)
      .contains(peakElement.solveV2(nums));
  }
}
