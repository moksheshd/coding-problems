package com.mokshesh.cp.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddBinaryStringsTest {

  private static AddBinaryStrings addBinaryStrings;

  @BeforeAll
  static void setUp() {
    addBinaryStrings = new AddBinaryStrings();
  }

  @Test
  void addBinaryV3ForInputLengthLessThan18() {
    String a = "100";
    String b = "11";
    String answer = addBinaryStrings.addBinaryV3(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("111");
  }

  @Test
  void addBinaryV3ForInputLengthGreaterThan18() {
    String a = "1010110111001101101000";
    String b = "1000011011000000111100110";
    String answer = addBinaryStrings.addBinaryV3(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("1001110001111010101001110");
  }

  @Test
  void addBinaryV2ForInputLengthLessThan18() {
    String a = "100";
    String b = "11";
    String answer = addBinaryStrings.addBinaryV2(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("111");
  }

  @Test
  void addBinaryV2ForInputLengthGreaterThan18() {
    String a = "1010110111001101101000";
    String b = "1000011011000000111100110";
    String answer = addBinaryStrings.addBinaryV2(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("1001110001111010101001110");
  }

  @Test
  void addBinaryForInputLengthLessThan18() {
    String a = "100";
    String b = "11";
    String answer = addBinaryStrings.addBinary(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("111");
  }

  @Test
  void addBinaryForInputLengthGreaterThan18() {
    String a = "1010110111001101101000";
    String b = "1000011011000000111100110";
    String answer = addBinaryStrings.addBinary(a, b);
    Assertions.assertThat(answer)
      .isEqualTo("1001110001111010101001110");
  }
}