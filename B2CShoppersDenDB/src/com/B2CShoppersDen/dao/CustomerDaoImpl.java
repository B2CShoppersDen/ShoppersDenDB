package com.B2CShoppersDen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.B2CShoppersDen.entities.Customer;
import com.B2CShoppersDen.model.LoginModel;
import com.B2CShoppersDen.integrate.ConnectionManager;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public boolean storeCustomerDetails(Customer customer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("Insert into Customer values ?,?,?,?,?");
		statement.setInt(1,customer.getCustomerId());
		statement.setString(2, customer.getFirstName());
		statement.setString(3, customer.getLastName());
		statement.setString(4, customer.getEmail());
		statement.setString(5, customer.getPhoneNumber());
		statement.setString(6, customer.getPassword());
	
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows >0)
		
			return true;
		
		else
		
		return false;
	}

	@Override
	public List<Customer> viewProfile(LoginModel model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Customer> profileList=new ArrayList<Customer>();
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("..");
		return profileList;
	}


}

	

