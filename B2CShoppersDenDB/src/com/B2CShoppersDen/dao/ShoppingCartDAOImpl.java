package com.B2CShoppersDen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.integrate.ConnectionManager;

public class ShoppingCartDAOImpl implements ShoppingCartDAO{
	

	

	@Override
	public boolean displayAmount() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("Insert into Product tablevalues ?,?,?,?,?,?");
		statement.setInt(1,product.getProductId());
		statement.setString(2,product.getProductName());
		statement.setString(3, product.getProductDescription());
		statement.setDouble(4, product.getProductPrice());
		statement.setString(5, product.getProductCategory());
		statement.setString(6, product.getProductImageUrl());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows >0)
			
			return true;
		
		else
		
		
		return false;
	}

	@Override
	public boolean displayCart() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("")
		
		
		
		
		return false;
	}

	
	

}
