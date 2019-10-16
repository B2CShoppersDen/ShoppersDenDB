package com.B2CShoppersDen.dao;

import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.service.Products;

/**
 * 
 * @author user
 * Declaration of data operations for business Entity products
 * @param <getAllProducts>
 *
 */

public interface ShoppingCartDAO<getAllProducts> {
	
	public getAllProducts getAllProducts() throws ClassNotFoundException,SQLException;
	
	public int displayAmount(Product product)throws ClassNotFoundException, SQLException;
	
	public boolean displayCart()throws ClassNotFoundException, SQLException;
	
	

}
