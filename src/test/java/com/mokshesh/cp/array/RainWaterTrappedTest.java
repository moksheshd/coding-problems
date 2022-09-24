package com.mokshesh.cp.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RainWaterTrappedTest {
  private static RainWaterTrapped rainWaterTrapped;

  @BeforeAll
  static void setUp() {
    rainWaterTrapped = new RainWaterTrapped();
  }

  @Test
  void trap1_1() {
    int[] a = {0, 1, 0, 2};
    Assertions.assertEquals(1, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap1_2() {
    int[] a = {1, 2};
    Assertions.assertEquals(0, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap1_3() {
    int[] a = {1};
    Assertions.assertEquals(0, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap1_4() {
    int[] a = {3, 0, 2, 0, 4};
    Assertions.assertEquals(7, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap1_5() {
    int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    Assertions.assertEquals(6, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap1_6() {
    int[] a = {69, 16, 39, 72, 34, 94, 15, 93, 68, 71, 98, 80, 66, 86, 47, 34, 84, 92, 71, 52, 29, 14, 92, 62, 72, 48, 70, 3, 41, 31, 48, 2, 98, 56, 39, 53, 25, 50, 62, 50, 31, 81, 93, 76, 98, 66, 21, 54, 76, 47, 61, 25, 7, 51, 100, 7, 93, 74, 8, 28, 32, 64, 65, 88, 28, 82, 71, 49, 33, 92, 17, 39, 13, 21, 95, 43, 89, 57, 31, 13, 48, 32, 15, 31, 43, 64, 73, 38, 55, 61, 39, 48, 53, 9, 35, 40, 10, 17, 12, 5, 85, 86, 69, 88, 41, 49, 86, 76, 87, 84, 34, 72, 6, 70, 51, 57, 14, 51, 42, 64, 8, 21, 47, 77, 41, 41, 15, 18, 100, 21, 87, 76, 54, 53, 2, 85, 91, 35, 68, 52, 45, 20, 24, 39, 0, 85, 37, 98, 39, 73, 84, 38, 34, 29, 26, 62, 82, 3, 16, 43, 85, 36, 59, 51, 59, 26, 65, 21, 67, 27, 54, 49, 94, 18, 4, 29, 51, 99, 70, 40, 60, 52, 68, 41, 21, 36, 97, 1, 96, 54, 12, 53, 11, 82, 92, 40, 96, 99, 92, 10, 6, 4, 84, 55, 61, 38, 79, 14, 72, 18, 47, 70, 80, 40, 26, 83, 27, 92, 30, 8, 29, 69, 88, 89, 92, 52, 68, 25, 77, 35, 84, 69, 44, 32, 76, 98, 89, 89, 10, 8, 37, 82, 93, 51, 30, 26, 75, 6, 88, 90, 8, 5, 24, 33, 39, 0, 33, 7, 38, 52, 1, 36, 76, 46, 28};
    Assertions.assertEquals(12099, rainWaterTrapped.trap1(a));
  }

  @Test
  void trap2_1() {
    int[] a = {0, 1, 0, 2};
    Assertions.assertEquals(1, rainWaterTrapped.trap2(a));
  }

  @Test
  void trap2_2() {
    int[] a = {1, 2};
    Assertions.assertEquals(0, rainWaterTrapped.trap2(a));
  }

  @Test
  void trap2_3() {
    int[] a = {1};
    Assertions.assertEquals(0, rainWaterTrapped.trap2(a));
  }

  @Test
  void trap2_4() {
    int[] a = {3, 0, 2, 0, 4};
    Assertions.assertEquals(7, rainWaterTrapped.trap2(a));
  }

  @Test
  void trap2_5() {
    int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    Assertions.assertEquals(6, rainWaterTrapped.trap2(a));
  }

  @Test
  void trap2_6() {
    int[] a = {69, 16, 39, 72, 34, 94, 15, 93, 68, 71, 98, 80, 66, 86, 47, 34, 84, 92, 71, 52, 29, 14, 92, 62, 72, 48, 70, 3, 41, 31, 48, 2, 98, 56, 39, 53, 25, 50, 62, 50, 31, 81, 93, 76, 98, 66, 21, 54, 76, 47, 61, 25, 7, 51, 100, 7, 93, 74, 8, 28, 32, 64, 65, 88, 28, 82, 71, 49, 33, 92, 17, 39, 13, 21, 95, 43, 89, 57, 31, 13, 48, 32, 15, 31, 43, 64, 73, 38, 55, 61, 39, 48, 53, 9, 35, 40, 10, 17, 12, 5, 85, 86, 69, 88, 41, 49, 86, 76, 87, 84, 34, 72, 6, 70, 51, 57, 14, 51, 42, 64, 8, 21, 47, 77, 41, 41, 15, 18, 100, 21, 87, 76, 54, 53, 2, 85, 91, 35, 68, 52, 45, 20, 24, 39, 0, 85, 37, 98, 39, 73, 84, 38, 34, 29, 26, 62, 82, 3, 16, 43, 85, 36, 59, 51, 59, 26, 65, 21, 67, 27, 54, 49, 94, 18, 4, 29, 51, 99, 70, 40, 60, 52, 68, 41, 21, 36, 97, 1, 96, 54, 12, 53, 11, 82, 92, 40, 96, 99, 92, 10, 6, 4, 84, 55, 61, 38, 79, 14, 72, 18, 47, 70, 80, 40, 26, 83, 27, 92, 30, 8, 29, 69, 88, 89, 92, 52, 68, 25, 77, 35, 84, 69, 44, 32, 76, 98, 89, 89, 10, 8, 37, 82, 93, 51, 30, 26, 75, 6, 88, 90, 8, 5, 24, 33, 39, 0, 33, 7, 38, 52, 1, 36, 76, 46, 28};
    Assertions.assertEquals(12099, rainWaterTrapped.trap2(a));
  }
}