package com.B2CShoppersDen.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.B2CShoppersDen.entities.Admin;

import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.entities.Transaction;
import com.B2CShoppersDen.integrate.ConnectionManager;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean storeProductDetails(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("Insert into Producttable values ?,?,?,?,?,?");
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
	public boolean deleteProductDetails(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("delete from Producttable where productId=?");
        
        statement.setInt(1, id);
        int rows = statement.executeUpdate();
        if(rows>0)
        	 return true;
        else
		return false;
	}

	@Override
	public boolean updateProductPrice(int productId,double newPrice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("update Producttable set productPrice=? where productId=?");
       
        statement.setInt(2, productId);
        statement.setDouble(1, newPrice);
        int rows = statement.executeUpdate();
        if(rows>0)
        	 return true;
        else
		return false;
	}

	@Override
	public boolean viewTransactionDetails(int transactionId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select * from transactiontable where transactionid=?");
		statement.setInt(1, transactionId);
		ResultSet resultSet = statement.executeQuery();
	    Transaction transaction = new Transaction();
		while(resultSet.next()) {
			transaction.setTransactionid(resultSet.getInt("transactionid"));
		}
		ConnectionManager.closeConnection();
		return true; 

	}

}






































