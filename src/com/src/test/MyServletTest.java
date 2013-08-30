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
		assertEquals(false, EmailValidation.validate("hello"));
	}
	@Test
	public void testInvalidWhichShouldFail() {
		fail();
	}
	
	@Test
	public void testValid() {
		assertEquals(true, EmailValidation.validate("hello@hello.dk"));
	}
	
	@Test
	public void testEmailHistory() {
//		assertEquals(true, EmailHistory.addNew("email@address.dk", true));
	}

}
