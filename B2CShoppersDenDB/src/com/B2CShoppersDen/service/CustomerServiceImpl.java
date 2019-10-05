package com.B2CShoppersDen.service;

import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.dao.CustomerDao;
import com.B2CShoppersDen.entities.Customer;
import com.B2CShoppersDen.helper.FactoryCustomerDB;
import com.B2CShoppersDen.model.LoginModel;
import com.B2CShoppersDen.model.RegisterCustomerModel;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		this.customerDao=FactoryCustomerDB.createCustomerDao();
	}

	@Override
	public String registerCustomer(RegisterCustomerModel model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerId(model.getCustomerId());
		customer.setFirstName(model.getFirstName());
		customer.setLastName(model.getLastName());
		customer.setEmail(model.getEmail());
		customer.setPhoneNumber(model.getPhoneNumber());
		customer.setPassword(model.getPassword());
		
		String result="fail";
		try {
			boolean stored=customerDao.storeCustomerDetails(customer);
			if(stored)
				result="success";
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			System.out.println("|ERROR[Registration failed because of internal issue...]");
			
		}
		return result;
	}

	@Override
	public List<Customer> viewProfile(LoginModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
