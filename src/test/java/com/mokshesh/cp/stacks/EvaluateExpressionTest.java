package com.mokshesh.cp.stacks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class EvaluateExpressionTest {

  private static EvaluateExpression evaluateExpression;

  private static Stream<Arguments> generateData() {
    return Stream.of(
      Arguments.of(Arrays.asList("2", "1", "+", "3", "*"), 9),
      Arguments.of(Arrays.asList("4", "13", "5", "/", "+"), 6),
      Arguments.of(Arrays.asList("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"), 22)
    );
  }

  @BeforeEach
  void setUp() {
    evaluateExpression = new EvaluateExpression();
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void evalRPN(List<String> input, Integer expectedResult) {
    Assertions.assertThat(evaluateExpression.evalRPN(input))
      .isEqualTo(expectedResult);
  }
}
