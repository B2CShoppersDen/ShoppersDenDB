package com.B2CShoppersDen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShoppingCartDAOImpl implements ShoppingCartDAO{
	

	@Override
	public boolean displayAmount() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement("Insert into Producttable values ?,?,?,?,?,?");
		statement.setInt(1,product.getProductId());
		statement.setString(2,product.getProductName());
		statement.setString(3, product.getProductDescription());
		statement.setDouble(4, product.getProductPrice());
		statement.setString(5, product.getProductCategory());
		statement.setString(6, product.getProductImageUrl());
	
		
		
		return false;
	}

	@Override
	public boolean displayCart() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	

}
