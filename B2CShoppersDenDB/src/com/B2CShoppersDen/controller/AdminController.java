package com.B2CShoppersDen.controller;

import com.B2CShoppersDen.View.AdminView;
import com.B2CShoppersDen.helper.FactoryAdminDB;
import com.B2CShoppersDen.service.AdminService;



public class AdminController {
	private AdminService adminService;
	AdminView adminView=new AdminView();
	
	public AdminController()
	{
		this.adminService=FactoryAdminDB.createAdminService();
	}

		

	public void addProduct() {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

	public void viewProduct() {
		// TODO Auto-generated method stub
		
	}

	public void viewTransaction() {
		// TODO Auto-generated method stub
		
	}

}
