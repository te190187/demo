package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


public class FooTest {
 @Test
 void 常に成功するテスト() {
  assertEquals(1, 1);
 } 
}
