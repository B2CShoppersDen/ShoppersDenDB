package com.B2CShoppersDen.controller;

import com.B2CShoppersDen.View.AdminView;
import com.B2CShoppersDen.helper.FactoryAdminDB;
import com.B2CShoppersDen.service.AdminService;
import com.B2CShoppersDen.service.AdminServiceImpl;



public class AdminController {
	private AdminService adminService;
	AdminView adminView=new AdminView();
	
	public AdminController()
	{
		this.adminService=FactoryAdminDB.createAdminService();
	}

		

	public void addProduct() {
		// TODO Auto-generated method stub
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.addProduct();  
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.deleteProduct(id);
		
	}

	public void updateProduct(int productId,double newPrice) {
		// TODO Auto-generated method stub
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.updateCost(productId, newPrice);
		
	}

	public void viewTransaction(int transactionId)
	{
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		adminServiceImpl.viewTransaction(transactionId);
		// TODO Auto-generated method stub
		
	}

}
