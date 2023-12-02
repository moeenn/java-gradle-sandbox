package com.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private final Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    int result = this.calculator.add(10, 20);
    assertEquals(result, 30);
  }
}