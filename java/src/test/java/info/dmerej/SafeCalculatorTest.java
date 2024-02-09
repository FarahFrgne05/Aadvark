package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafeCalculatorTest {
  @Test
  void should_not_throw_when_authorized() {
    // TODO: write a test to demonstrate the bug in SafeCalculator.add()
    SafeCalculator calculator = new SafeCalculator(() -> true);
    int actual = calculator.add(1, 2);
    assertEquals(3, actual);

  }
}
