package com.mokshesh.cp.ll;

import com.mokshesh.cp.helper.ListNode;
import com.mokshesh.cp.helper.ListNodeHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DeleteTheMiddleNodeOfLinkedListTest {
  static DeleteTheMiddleNodeOfLinkedList deleteTheMiddleNodeOfLinkedList;

  @BeforeAll
  static void setUp() {
    deleteTheMiddleNodeOfLinkedList = new DeleteTheMiddleNodeOfLinkedList();
  }

  static Stream<Arguments> generateData() {
    return Stream.of(
      Arguments.arguments(ListNodeHelper.build(new int[]{1, 3, 4, 7, 1, 2, 6}), new int[]{1, 3, 4, 1, 2, 6}),
      Arguments.arguments(ListNodeHelper.build(new int[]{1, 2, 3, 4}), new int[]{1, 2, 4}),
      Arguments.arguments(ListNodeHelper.build(new int[]{2, 1}), new int[]{2}),
      Arguments.arguments(ListNodeHelper.build(new int[]{1, 2, 3, 4, 5}), new int[]{1, 2, 4, 5}),
      Arguments.arguments(ListNodeHelper.build(new int[]{43}), new int[]{})
    );
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void deleteMiddle(ListNode head, int[] expectedResult) {
    Assertions.assertThat(ListNodeHelper.toArray(deleteTheMiddleNodeOfLinkedList.deleteMiddle(head)))
      .hasSize(expectedResult.length)
      .containsSequence(expectedResult);
  }
}
