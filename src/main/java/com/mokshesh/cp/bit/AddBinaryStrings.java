package com.mokshesh.cp.bit;

/**
 * <div class="html-content__container cr-p-statement"><p><strong>Problem Description</strong><br>
 *  </p>
 * <div id="problem_description_markdown_content_value" style="padding: 5px 10px; ">Given two binary strings, return their sum (also a binary string).
 * <p><strong>Example:</strong></p>
 * <pre><code>a = "100"
 *
 * b = "11"
 * Return a + b = "111".
 * </code></pre>
 * </div>
 * <p><br><br></p></div>
 *
 * @link <a href="https://www.geeksforgeeks.org/program-to-add-two-binary-strings/">geeksforgeeks</a>
 * @link <a href="https://leetcode.com/problems/add-binary/">leetcode</a>
 * @level easy
 * @topic bit
 */
public class AddBinaryStrings {

  public String addBinaryV3(String a, String b) {
    int nA;
    int nB;
    char[] res;
    int i;
    int j;
    int k;
    nA = a.length();
    nB = b.length();
    res = new char[Math.max(nA, nB) + 1];
    k = Math.max(nA, nB);
    i = nA - 1;
    j = nB - 1;
    int sum;
    int carry = 0;
    while (i >= 0 || j >= 0 || carry != 0) {
      sum = carry;
      if (i >= 0)
        sum += (a.charAt(i) - '0');
      if (j >= 0)
        sum += (b.charAt(j) - '0');
      res[k] = (char) ((sum % 2) + '0');
      carry = sum / 2;
      i--;
      j--;
      k--;
    }
    if (res[0] == '1')
      return new String(res);
    int len = Math.max(nA, nB);
    return new String(res, 1, len);
  }

  public String addBinaryV2(String a, String b) {
    StringBuilder result = new StringBuilder();
    int n = a.length();
    int m = b.length();
    int diff = Math.abs(n - m);
    // Pad the small string and make them of equal length
    StringBuilder padd = new StringBuilder();
    padd.append("0".repeat(diff));
    if (n < m) {
      a = padd + a;
    } else {
      b = padd + b;
    }
    int length = a.length() - 1;
    int carry = 0;
    while (length >= 0) {
      int x = Integer.parseInt(a.charAt(length) + "");
      int y = Integer.parseInt(b.charAt(length) + "");
      int sum = x + y + carry;
      carry = sum / 2;
      int remainder = sum % 2;
      result.append(remainder);
      length--;
    }
    if (carry == 1) {
      result.append(carry);
    }
    return result.reverse().toString();
  }

  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int n = a.length() - 1;
    int m = b.length() - 1;
    int carry = 0;
    while (n >= 0 && m >= 0) {
      int x = Integer.parseInt(a.charAt(n) + "");
      int y = Integer.parseInt(b.charAt(m) + "");
      int sum = x + y + carry;
      int divisor = sum / 2;
      int remainder = sum % 2;
      carry = divisor;
      result.append(remainder);
      n--;
      m--;
    }
    while (n >= 0) {
      int x = Integer.parseInt(a.charAt(n) + "");
      int sum = x + carry;
      int divisor = sum / 2;
      int remainder = sum % 2;
      carry = divisor;
      result.append(remainder);
      n--;
    }
    while (m >= 0) {
      int y = Integer.parseInt(b.charAt(m) + "");
      int sum = y + carry;
      int divisor = sum / 2;
      int remainder = sum % 2;
      carry = divisor;
      result.append(remainder);
      m--;
    }
    if (carry == 1) {
      result.append(carry);
    }
    return result.reverse().toString();
  }
}
