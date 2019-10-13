package com.B2CShoppersDen.dao;

import java.sql.SQLException;

/**
 * 
 * @author user
 * Declaration of data operations for business Entity products
 *
 */

public interface ShoppingCartDAO {
	
	public boolean displayAmount()throws ClassNotFoundException, SQLException;
	
	public boolean displayCart()throws ClassNotFoundException, SQLException;

}
