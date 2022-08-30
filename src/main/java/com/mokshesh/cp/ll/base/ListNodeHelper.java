package com.mokshesh.cp.ll.base;

public class ListNodeHelper {
  private ListNodeHelper() {
  }

  public static ListNode build(int[] nums) {
    if (nums.length == 0) {
      return null;
    }
    ListNode head = new ListNode(nums[0]);
    ListNode previous = head;
    for (int i = 1; i < nums.length; i++) {
      previous.next = new ListNode(nums[i]);
      previous = previous.next;
    }
    return head;
  }

  public static int size(ListNode head) {
    if (head == null) {
      return 0;
    }
    int length = 1;
    while (head.next != null) {
      length++;
      head = head.next;
    }
    return length;
  }

  public static boolean isEqual(ListNode head, int[] nums) {
    return isEqual(head, build(nums));
  }

  public static boolean isEqual(ListNode head1, ListNode head2) {
    while (head1 != null && head2 != null) {
      if (head1.val != head2.val) {
        return false;
      }
      head1 = head1.next;
      head2 = head2.next;
    }
    return head1 == null && head2 == null;
  }

  public static int[] toArray(ListNode head) {
    int length = size(head);
    if (length == 0) {
      return new int[0];
    }
    int[] nums = new int[length];
    int i = 0;
    while (head != null) {
      nums[i++] = head.val;
      head = head.next;
    }
    return nums;
  }
}
