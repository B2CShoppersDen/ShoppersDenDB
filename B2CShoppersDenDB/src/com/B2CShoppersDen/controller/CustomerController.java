package com.B2CShoppersDen.controller;

import java.sql.SQLException;
import java.util.List;

import com.B2CShoppersDen.View.CustomerView;
import com.B2CShoppersDen.entities.Customer;
import com.B2CShoppersDen.helper.FactoryCustomerDB;
import com.B2CShoppersDen.model.RegisterCustomerModel;
import com.B2CShoppersDen.service.CustomerService;
import com.B2CShoppersDen.validation.CustomerModelValidator;

public class CustomerController {
	
	private CustomerService customerService;
	CustomerView customerView=new CustomerView();
	
	public CustomerController()
	{
		this.customerService=FactoryCustomerDB.createCustomerService();
	}

	public void handleRegisterEmployee(RegisterCustomerModel model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		CustomerModelValidator validator=new CustomerModelValidator();
		
		if(validator.validate(model))
		{
			String outcome=customerService.registerCustomer(model);
			if(outcome.contentEquals("Success")) {
				customerView.showRegistrationSuccess(model);
			}
			else
			{
				customerView.validationFailedError();
			}
		}
		
		}

	public void viewProduct() {
		// TODO Auto-generated method stub
		
	}

	public void addToCart() {
		// TODO Auto-generated method stub
		
	}

	public void viewCartProducts() {
		// TODO Auto-generated method stub
		
	}

	public void viewPayment() {
		// TODO Auto-generated method stub
		
	}
}	


