package com.B2CShoppersDen.dao;

import java.sql.SQLException;

import com.B2CShoppersDen.entities.Product;


public interface AdminDAO {

	public boolean storeProductDetails(Product product) throws ClassNotFoundException, SQLException;

	public boolean deleteProductDetails(int id) throws ClassNotFoundException, SQLException;
	
	public boolean updateProductPrice(int productId,double newPrice) throws ClassNotFoundException, SQLException;
	
	public boolean  viewTransactionDetails(int transactionId) throws ClassNotFoundException, SQLException;

}

