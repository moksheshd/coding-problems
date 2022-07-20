package com.mokshesh.cp.array;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

class MergeIntervalsTest {
  private static MergeIntervals mergeIntervals;

  @BeforeAll
  static void setUp() {
    mergeIntervals = new MergeIntervals();
  }

  @Test
  void insert() {
    List<MergeIntervals.Interval> intervals = Lists.list(
      new MergeIntervals.Interval(1, 3),
      new MergeIntervals.Interval(6, 9)
    );
    MergeIntervals.Interval newInterval = new MergeIntervals.Interval(2, 5);
    List<MergeIntervals.Interval> result = mergeIntervals.insert(intervals, newInterval);

    assertThat(result)
      .isNotEmpty()
      .hasSize(2)
      .extracting("start", "end")
      .containsAll(List.of(tuple(1, 5), tuple(6, 9)));
  }

  @Test
  void insert1() {
    List<MergeIntervals.Interval> intervals = Lists.list(
      new MergeIntervals.Interval(1, 3),
      new MergeIntervals.Interval(6, 9)
    );
    MergeIntervals.Interval newInterval = new MergeIntervals.Interval(2, 6);
    List<MergeIntervals.Interval> result = mergeIntervals.insert(intervals, newInterval);

    assertThat(result)
      .isNotEmpty()
      .hasSize(1)
      .extracting("start", "end")
      .containsAll(List.of(tuple(1, 9)));
  }

  @Test
  void insert2() {
    List<MergeIntervals.Interval> intervals = Lists.list(
      new MergeIntervals.Interval(1, 2),
      new MergeIntervals.Interval(3, 6)
    );
    MergeIntervals.Interval newInterval = new MergeIntervals.Interval(10, 8);
    List<MergeIntervals.Interval> result = mergeIntervals.insert(intervals, newInterval);

    assertThat(result)
      .isNotEmpty()
      .hasSize(3)
      .extracting("start", "end")
      .containsAll(List.of(tuple(1, 2), tuple(3, 6), tuple(8, 10)));
  }
}