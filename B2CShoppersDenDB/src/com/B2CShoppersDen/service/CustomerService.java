package com.B2CShoppersDen.service;

import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.entities.Customer;
import com.B2CShoppersDen.model.LoginModel;
import com.B2CShoppersDen.model.RegisterCustomerModel;

public interface CustomerService {

		public String registerCustomer(RegisterCustomerModel model)throws ClassNotFoundException,SQLException;
		public List<Customer> viewProfile(LoginModel model);
	} 

