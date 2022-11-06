package com.mokshesh.cp.stacks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {

  private static BalancedParenthesis balancedParenthesis;

  private static Stream<Arguments> generateData() {
    return Stream.of(
      Arguments.arguments("()", true),
      Arguments.arguments("()[]{}", true),
      Arguments.arguments("(]", false),
      Arguments.arguments("{([])}", true),
      Arguments.arguments("(){", false),
      Arguments.arguments("()[]", true),
      Arguments.arguments("))))))", true)
    );
  }

  @BeforeAll
  static void setUp() {
    balancedParenthesis = new BalancedParenthesis();
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void isValid(String input, boolean expectedResult) {
    Assertions.assertThat(balancedParenthesis.isValid(input))
      .isEqualTo(expectedResult);
  }
}
