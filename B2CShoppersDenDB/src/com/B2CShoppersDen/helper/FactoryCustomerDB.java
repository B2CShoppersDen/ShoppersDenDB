package com.B2CShoppersDen.helper;

import com.B2CShoppersDen.dao.CustomerDao;
import com.B2CShoppersDen.dao.CustomerDaoImpl;
import com.B2CShoppersDen.dao.LoginDAO;
import com.B2CShoppersDen.dao.LoginDAOImpl;
import com.B2CShoppersDen.service.AdminService;
import com.B2CShoppersDen.service.CustomerService;
import com.B2CShoppersDen.service.CustomerServiceImpl;
import com.B2CShoppersDen.service.LoginService;
import com.B2CShoppersDen.service.LoginServiceImpl;

public class FactoryCustomerDB {
	
	public static CustomerDao createCustomerDao()
	{
		CustomerDao customerDao=new CustomerDaoImpl();
		return customerDao;
		
	}
	public static CustomerService createCustomerService() {
		
		CustomerService customerService=new CustomerServiceImpl();
		return customerService;
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
