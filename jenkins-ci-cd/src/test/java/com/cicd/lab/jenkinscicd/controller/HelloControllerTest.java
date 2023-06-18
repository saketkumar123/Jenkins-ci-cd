package com.cicd.lab.jenkinscicd.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {
	
	@Test
	public void getHelloWorldTest() {
		String msg = "HelloWorld";
		assertEquals(msg, "HelloWorld");
		assertNotEquals(msg, "Hello");
	}

}
