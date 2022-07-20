package com.mokshesh.cp.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style=" padding: 5px 10px; "><p>Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).</p><p>You may assume that the intervals were initially sorted according to their start times.</p></div>
 * <p><strong>Problem Constraints</strong><br>
 *  </p>
 * <div id="problem_constraints_markdown_content_value" style=" padding: 5px 10px; "><p>0 &lt;= <strong>|intervals|</strong> &lt;= 10<sup>5</sup> </p></div>
 * <p><strong>Input Format</strong><br>
 *  </p>
 * <div id="input_format_markdown_content_value" style=" padding: 5px 10px; "><p> First argument is the vector of intervals </p><p> second argument is the new interval to be merged</p></div>
 * <p><strong>Output Format</strong><br>
 *  </p>
 * <div id="output_format_markdown_content_value" style=" padding: 5px 10px; "><p> Return the vector of intervals after merging </p></div>
 * <p><strong>Example Input</strong><br>
 *  </p>
 * <div id="example_input_markdown_content_value" style=" padding: 5px 10px; "><p>Input 1:</p><pre>Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
 * </pre>
 * <p>Input 2:</p>
 * <pre>Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
 * </pre></div>
 * <p><strong>Example Output</strong><br>
 *  </p>
 * <div id="example_output_markdown_content_value" style=" padding: 5px 10px; "><p>Output 1:</p><pre> [ [1, 5], [6, 9] ]
 * </pre>
 * <p>Output 2:</p>
 * <pre> [ [1, 9] ]
 * </pre></div>
 * <p><strong>Example Explanation</strong><br>
 *  </p>
 * <div id="example_explanation_markdown_content_value" style=" padding: 5px 10px; "><p>Explanation 1:</p><pre>(2,5) does not completely merge the given intervals
 * </pre>
 * <p>Explanation 2:</p>
 * <pre>(2,6) completely merges the given intervals
 * </pre></div>
 * </div>
 *
 * @link <a href="https://www.interviewbit.com/problems/merge-intervals/">interviewbit</a>
 * @level medium
 * @topic array
 */
public class MergeIntervals {

  private boolean isOverlapping(Interval i1, Interval i2) {
    return (Math.max(i1.start, i2.start) <= Math.min(i1.end, i2.end));
  }

  /**
   * <div class="html-content cr-p-hint-modal__content"><div class="html-content__container">
   * <p>
   * Given all the intervals, you need to figure out the sequence of intervals that intersect with the given new interval.</p>
   * <p>Lets see how we check if interval 1 (a,b) intersects with interval 2 (c,d):</p>
   * <p><strong>Overlap case :</strong></p>
   * <div class="highlighter-rouge"><pre class="highlight"><code>    a---------------------b                      OR       a------b
   *                 c-------------------d                c------------------d
   * </code></pre>
   * </div>
   * <p><strong>Non-overlap case:</strong></p>
   * <div class="highlighter-rouge"><pre class="highlight"><code>    a--------------------b   c------------------d
   * </code></pre>
   * </div>
   * <p><em>Note that if max(a,c) &gt; min(b,d), then the intervals do not overlap. Otherwise, they overlap</em>.</p>
   * <p>Once we figure out the intervals ( interval[i] to the interval[j] ) which overlap with the new interval, note that we can replace all the overlapping intervals with one interval, which would be</p>
   * </div></div>
   */
  // TODO Revist
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    if (newInterval.start > newInterval.end) {
      int temp = newInterval.start;
      newInterval.start = newInterval.end;
      newInterval.end = temp;
    }
    ArrayList<Interval> result = new ArrayList<>();
    int n = intervals.size();

    for (int i = 0; i < n; i++) {
      Interval currentInterval = intervals.get(i);

      if (isOverlapping(currentInterval, newInterval)) {
//      overlapping: merge both intervals and update the new interval
//      e.g.: currentInterval [10,14] & newInterval - [12,22]
//      then new interval becomes [10,22] and proceed to check with next intervals
        newInterval.start = Math.min(currentInterval.start, newInterval.start);
        newInterval.end = Math.max(currentInterval.end, newInterval.end);
      } else {
        if (currentInterval.end < newInterval.start) {
//          non overlapping condition 1 e.g.: currentInterval - [2,5] & new Interval - [8,10]
//          push currentInterval to result
          result.add(currentInterval);
        } else {
//          non overlapping condition 2: e.g.: currentInterval - [8,10] & new Interval - [2,5]
//          we push newInterval to result and then remaining all intervals
          result.add(newInterval);
          for (int j = i; j < n; j++) {
            result.add(intervals.get(j));
          }
          return result;
        }
      }
    }
//    edge case:  if the newInterval is outside of range of all intervals then at last
//    it's pushed to result.
    result.add(newInterval);
    return result;

  }

  static class Interval {
    int start;
    int end;

    Interval() {
      start = 0;
      end = 0;
    }

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

}
