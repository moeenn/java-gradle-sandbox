package com.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
  @Test
  public void testRandomNumber() {
    int result = Main.randomNumber();
    assertEquals(result, 42);
  }
}
