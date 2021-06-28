package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {

  static final long[][] testCases = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3_628_800},
      {13, 6_227_020_800L},
  };

  @Test
  void computeRecursive_nonExceptional() {
    for (long[] testCase: testCases){
      int n = (int) testCase[0];
      long expected = testCase[1];
      long actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
  }
  @Test
  void computeRecursive_exceptional() {
  assertThrows(IllegalArgumentException.class, new Executable() {
    @Override
    public void execute() throws Throwable {
      Factorials.computeRecursive(-1);
    }
  });
  }
}