package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


public class FooTest {
 @Test
 void 常に失敗するテスト() {
  assertEquals(10, 1);
 } 
}
