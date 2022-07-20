package com.mokshesh.cp.array;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class MergeOverlappingIntervalsTest {
  private static MergeOverlappingIntervals mergeOverlappingIntervals;

  @BeforeAll
  static void setUp() {
    mergeOverlappingIntervals = new MergeOverlappingIntervals();
  }

  @Test
  void merge() {
    List<Interval> intervals = Arrays.asList(
      new Interval(2, 6),
      new Interval(8, 10),
      new Interval(1, 3),
      new Interval(15, 18)
    );
    List<Interval> result = mergeOverlappingIntervals.merge(intervals);
    assertThat(result)
      .isNotEmpty()
      .hasSize(3)
      .extracting("start", "end")
      .contains(tuple(1, 6), tuple(8, 10), tuple(15, 18));
  }
}