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
	public boolean deleteProductDetails(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("delete from Producttable where productId=?");
        System.out.println("Enter ProductId");
        Scanner scanner =new Scanner(System.in);
        int choice =scanner.nextInt();
        statement.setInt(1, choice);
        int rows = statement.executeUpdate();
        if(rows>0)
        	 return true;
        else
		return false;
	}

	@Override
	public boolean updateProductPrice(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("update Producttable set productPrice=? where productId=?");
        System.out.println("Enter ProductId");
        Scanner scanner =new Scanner(System.in);
        int choice =scanner.nextInt();
        System.out.println("Enter New Price");
        double newPrice = scanner.nextDouble();
        statement.setInt(2, choice);
        statement.setDouble(1, newPrice);
        int rows = statement.executeUpdate();
        if(rows>0)
        	 return true;
        else
		return false;
	}

	@Override
	public boolean viewTransactionDetails(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select * from transactiontable where transactionid=?");
		System.out.println("Enter Transaction Id");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		statement.setInt(1, choice);
		ResultSet resultSet = statement.executeQuery();
	    Transaction transaction = new Transaction();
		while(resultSet.next()) {
			transaction.setTransactionid(resultSet.getInt("transactionid"));
		}
		ConnectionManager.closeConnection();
		return true; 
		
	}

}






































