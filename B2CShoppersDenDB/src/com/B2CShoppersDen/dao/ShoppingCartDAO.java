package com.B2CShoppersDen.dao;

import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.service.Products;

import com.B2CShoppersDen.entities.Product;

/**
 * 
 * @author user
 * Declaration of data operations for business Entity products
 * @param <getAllProducts>
 *
 */

public interface ShoppingCartDAO<getAllProducts> {
	
<<<<<<< HEAD
	public getAllProducts getAllProducts() throws ClassNotFoundException,SQLException;
	
	public int displayAmount(Product product)throws ClassNotFoundException, SQLException;
=======

>>>>>>> branch 'master' of https://github.com/B2CShoppersDen/ShoppersDenDB
	
	public boolean displayCart()throws ClassNotFoundException, SQLException;
	
	

	boolean displayAmount(Product product) throws ClassNotFoundException, SQLException;

}
