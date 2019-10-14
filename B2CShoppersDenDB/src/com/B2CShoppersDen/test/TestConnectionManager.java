
package com.B2CShoppersDen.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.B2CShoppersDen.integrate.ConnectionManager;

class TestConnectionManager {

	@Test
	void testopenConnection_positive() {
		try {
			Connection connection=ConnectionManager.openConnection();
			assertEquals(true,connection!=null);
		} catch (ClassNotFoundException | SQLException e) {
			//TODO Auto-generated catch block
			assertTrue(false);
		}
	
	}



}
