package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static final int[] values = {25, 60, 33, 7};
  static final String[] expectedStatuses = {"buzz", "fizzbuzz", "fizz", "7"};

  @Test
  void getStatus() {
    for (int i = 0; i < values.length; i++) {
      assertEquals(expectedStatuses[i], FizzBuzz.getStatus(values[i]));
    }
  }

}