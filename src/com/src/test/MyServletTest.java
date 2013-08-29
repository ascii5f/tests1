package com.src.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.src.pkg.EmailValidation;

public class MyServletTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInvalid() {
		assertEquals("Email is invalid: hello", EmailValidation.validate("hello"));
	}
	@Test
	public void testInvalidWhichShouldFail() {
		fail();
	}
	
	@Test
	public void testValid() {
		assertEquals("Email is valid: hello@hello.dk", EmailValidation.validate("hello@hello.dk"));
	}
	
	@Test
	public void testEmpty() {
		assertEquals("You have to fill in the email.", EmailValidation.validate(""));
	}

}
