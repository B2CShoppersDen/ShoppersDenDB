package com.B2CShoppersDen.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.B2CShoppersDen.dao.ShoppingCartDAO;
import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.entities.ShoppingCart;
import com.B2CShoppersDen.helper.FactoryShoppingCartDB;
import com.B2CShoppersDen.model.ProductModel;
import com.B2CShoppersDen.model.ShoppingCartModel;
import com.virtusa.entities.Employees;
import com.virtusa.model.EmployeesModel;


public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	
	

	private ShoppingCartDAO shoppingCartDAO;
	
	public ShoppingCartServiceImpl() {
		this.shoppingCartDAO=FactoryShoppingCartDB.createShoppingcartDAO();
		
	}

	@Override
	public List<ShoppingCartModel> retrieveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoppingCartModel> retrieveProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoppingCartModel> retrieveProductName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoppingCartModel> retrievePrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoppingCartModel> retrieveQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

}