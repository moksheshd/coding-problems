package com.mokshesh.cp.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a collection of intervals, merge all overlapping intervals.</p>
 *  </div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>1 &lt;= Total number of intervals &lt;= 100000.</p></div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p>First argument is a list of intervals.</p></div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p>Return the sorted list of intervals after merging all the overlapping intervals.</p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p><pre>[1,3],[2,6],[8,10],[15,18]</pre>
 * </div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p><pre>[1,6],[8,10],[15,18]</pre>
 * </div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p><pre>Merge intervals [1,3] and [2,6] -&gt; [1,6].
 * so, the required answer after merging is [1,6],[8,10],[15,18].
 * No more overlapping intervals present.</pre>
 * </div>
 * </div>
 *
 * @link <a href="https://www.geeksforgeeks.org/merging-intervals/">geeksforgeeks</a>
 * @link <a href="https://www.interviewbit.com/problems/merge-overlapping-intervals/">interviewbit</a>
 * @level medium
 * @topic array
 */
public class MergeOverlappingIntervals {
  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();
    intervals.sort(Comparator.comparingInt(interval -> interval.start));

    int index = 0;
    result.add(intervals.get(index));
    for (int i = 1; i < intervals.size(); i++) {
      Interval currentInterval = intervals.get(i);
      Interval interval = result.get(index);
      if (currentInterval.start <= interval.end) {
        interval.start = Math.min(interval.start, currentInterval.start);
        interval.end = Math.max(interval.end, currentInterval.end);
      } else {
        index++;
        result.add(currentInterval);
      }
    }
    return result;

  }
}

class Interval {
  int start;
  int end;

  Interval() {
    start = 0;
    end = 0;
  }

  Interval(int s, int e) {
    start = s;
    end = e;
  }
}
