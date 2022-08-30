package com.mokshesh.cp.ll.base;

public class ListNode {
  public ListNode next;
  int val;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
