package com.mokshesh.cp.stacks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DoubleCharacterTroubleTest {

  private static DoubleCharacterTrouble doubleCharacterTrouble;

  private static Stream<Arguments> generateData() {
    return Stream.of(
      Arguments.arguments("abccbc", "ac"),
      Arguments.arguments("ab", "ab")
    );
  }

  @BeforeEach
  void setUp() {
    doubleCharacterTrouble = new DoubleCharacterTrouble();
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void solve(String input, String expectedResult) {
    Assertions.assertThat(doubleCharacterTrouble.solve(input)).isEqualTo(expectedResult);
  }
}
