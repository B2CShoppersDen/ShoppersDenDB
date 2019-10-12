package com.B2CShoppersDen.dao;

import java.sql.SQLException;

import com.B2CShoppersDen.entities.Product;


public interface AdminDAO {

	public boolean storeProductDetails(Product product) throws ClassNotFoundException, SQLException;

	public boolean deleteProductDetails(Product product) throws ClassNotFoundException, SQLException;
	
	public boolean updateProductPrice(Product product) throws ClassNotFoundException, SQLException;
	
	public boolean  viewTransactionDetails(Product product) throws ClassNotFoundException, SQLException;

}

