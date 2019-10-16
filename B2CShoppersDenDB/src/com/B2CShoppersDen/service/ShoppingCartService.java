package com.B2CShoppersDen.service;

import java.util.List;

import com.B2CShoppersDen.model.ShoppingCartModel;



public interface ShoppingCartService {
	
	public List<ShoppingCartModel> retrieveProducts();
	List<ShoppingCartModel> retrieveProductId();
	List<ShoppingCartModel> retrieveProductName();
	List<ShoppingCartModel> retrievePrice();
	List<ShoppingCartModel> retrieveQuantity();
	
	

}
