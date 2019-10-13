package com.B2CShoppersDen.service;

public interface AdminService {
	
	public void addProduct();
	public void deleteProduct(int id);
	public void updateCost(int productId,double newPrice);
	public void viewTransaction(int transactionId);

}
