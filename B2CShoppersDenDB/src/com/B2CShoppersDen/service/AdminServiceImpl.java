  package com.B2CShoppersDen.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.B2CShoppersDen.View.AdminView;
import com.B2CShoppersDen.dao.AdminDAOImpl;
import com.B2CShoppersDen.entities.Product;
import com.B2CShoppersDen.model.ProductModel;

public class AdminServiceImpl implements AdminService {

	@Override
	public void addProduct()
	{
		
		
		List<ProductModel> productList = new ArrayList<ProductModel>();
		Product product = new Product();
		AdminView adminView = new AdminView();
		ProductModel productModel =new ProductModel();
		productModel = adminView.retriveProduct();
		productList.add(productModel);
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		try {
			adminDAOImpl.storeProductDetails(product);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

	@Override
	public void deleteProduct(int id)
	{  
		Scanner scanner = new Scanner(System.in) ;
		List<ProductModel> productList = new ArrayList<ProductModel>();
		AdminView adminView = new AdminView();
		ProductModel productModel =new ProductModel();
		productModel = adminView.retriveProduct();
		productList .remove(id);
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		try {
			adminDAOImpl.deleteProductDetails(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void updateCost(int productId,double newPrice)
	{
		Scanner scanner = new Scanner(System.in);
		List<ProductModel> productList = new ArrayList<ProductModel>();
		AdminView adminView = new AdminView();
		ProductModel productModel =new ProductModel();
		productModel = adminView.retriveProduct();
		if(productModel.getProductId()==productId)
		productModel.setProductPrice(newPrice);
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		try {
			adminDAOImpl.updateProductPrice(productId,newPrice);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

	@Override
	public void viewTransaction(int transactionId)
	{
		AdminDAOImpl adminDAOImpl = new AdminDAOImpl();
		try {
			adminDAOImpl.viewTransactionDetails(transactionId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
	}

	
}


