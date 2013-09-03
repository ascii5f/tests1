package com.src.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.src.pkg.EmailValidation;

public class EmailValidationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInvalid() {
		boolean expected = false;
		boolean actual = EmailValidation.validate("hello");
		assertEquals(expected, actual);
	}
	@Test
	public void testInvalidWhichShouldFail() {
		fail();
	}
	
	@Test
	public void testValid() {
		boolean expected = true;
		boolean actual = EmailValidation.validate("hello@hello.dk");
		assertEquals(expected, actual);
	}
	


}
