package com.B2CShoppersDen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.integrate.ConnectionManager;
import com.B2CShoppersDen.service.Products;
import com.virtusa.dao.EmployeesDAO;
import com.virtusa.entities.Employees;

public class JDBCShoppingCartDAOImpl implements ShoppingCartDAO{
	
	@Override
	public  List<Products> getAllProducts() throws ClassNotFoundException, SQLException {
		// TODO AAuto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from products");
		 List<Products> productsList=new ArrayList<Products>();
		 while(resultSet.next()) {
			 Products products=new Products();
			 products.setProductId(resultSet.getInt("product_id"));
			 products.setProductName(resultSet.getString("product_name"));
			 products.setProductPrice(resultSet.getDouble("product_price"));
			 products.setProductQuantity(resultSet.getInt("product_quantity"));
		 }
		 
		  ConnectionManager.closeConnection();
		return productsList;
	}

	@Override
	public int displayAmount(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement()
				
				
				ResultSet resultSet=statement.executeQuery();
		
		
		
		return 0;
	}

	@Override
	public boolean displayCart() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement()
		
		
		
		
		
		return false;
	}


}	
	



