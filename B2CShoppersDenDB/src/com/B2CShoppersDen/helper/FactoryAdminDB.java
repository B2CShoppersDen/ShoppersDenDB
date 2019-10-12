package com.B2CShoppersDen.helper;

import com.B2CShoppersDen.dao.AdminDAO;
import com.B2CShoppersDen.dao.AdminDAOImpl;
import com.B2CShoppersDen.dao.LoginDAO;
import com.B2CShoppersDen.dao.LoginDAOImpl;
import com.B2CShoppersDen.service.AdminService;
import com.B2CShoppersDen.service.AdminServiceImpl;
import com.B2CShoppersDen.service.LoginService;
import com.B2CShoppersDen.service.LoginServiceImpl;

public class FactoryAdminDB {
	public static AdminDAO createCustomerDao()
	{
		AdminDAO adminDAO=new AdminDAOImpl();
		return adminDAO;
		
	}
	public static AdminService createAdminService() {
		
		AdminService adminService=new AdminServiceImpl();
		return adminService;
	}
	public static LoginDAO createLoginDAO() {
		LoginDAO loginDAO=new LoginDAOImpl();
		return loginDAO;
	}
	public static LoginService createLoginService() {
		LoginService loginservice=new LoginServiceImpl();
		return loginservice;
	}
}



