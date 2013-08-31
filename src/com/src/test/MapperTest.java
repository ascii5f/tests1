package com.src.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.scr.persistence.Mapper;

public class MapperTest {

	@Test
	public void test() {
		Mapper m = new Mapper();
		m.tryConnecting();
		assertTrue(true);
	}

}
