package com.B2CShoppersDen.dao;

import java.sql.SQLException;

import com.B2CShoppersDen.entities.Product;

/**
 * 
 * @author user
 * Declaration of data operations for business Entity products
 *
 */

public interface ShoppingCartDAO {
	

	
	public boolean displayCart()throws ClassNotFoundException, SQLException;

	boolean displayAmount(Product product) throws ClassNotFoundException, SQLException;

}
