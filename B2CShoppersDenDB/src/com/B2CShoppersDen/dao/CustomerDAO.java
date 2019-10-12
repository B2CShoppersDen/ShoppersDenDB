package com.B2CShoppersDen.dao;


import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.entities.Customer;
import com.B2CShoppersDen.model.LoginModel;

public interface CustomerDAO {

	public boolean storeCustomerDetails(Customer customer)throws ClassNotFoundException,SQLException;
	
	public List<Customer> viewProfile(LoginModel model) throws ClassNotFoundException,SQLException;
}
