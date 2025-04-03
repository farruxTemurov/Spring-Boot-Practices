package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoServiceTest {

	@Autowired
	DemoService demoservice;

	@Test
	void testCheckLoginDetails() {
		boolean result1 = demoservice.CheckLoginDetails("user1@gmail.com", "user@123");
		assertFalse(result1);

		boolean result2 = demoservice.CheckLoginDetails("admin@gmail.com", "admin@123");
		assertTrue(result2);
	}

}
