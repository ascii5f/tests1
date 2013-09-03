package com.src.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.scr.persistence.Mapper;
import com.src.pkg.EmailValidation;
import com.src.pkg.IMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MapperTest {

	@Test
	public void test() {
		Mapper m = new Mapper();
		m.tryConnecting();
		assertTrue(true);
	}

	@Test
	public void testEmailHistory() {
		int noOfRowsBefore = 0;		
		Mapper mapper = new Mapper();
		Connection con = mapper.getConnection();
		Statement st = null;
		ResultSet rs = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(*) FROM email");
			noOfRowsBefore = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}
		
		IMapper imapper = new Mapper();
		boolean expected = false;
		boolean actual = imapper.addNew("email@address.dk", true);
		assertEquals(expected, actual);

		int noOfRowsAfter = 0;
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT COUNT(*) FROM email");
			noOfRowsAfter = rs.getInt(1);
			int expected2 = 1;
			int actual2 = noOfRowsAfter - noOfRowsBefore;
			assertEquals(expected2, actual2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}

	}

}
