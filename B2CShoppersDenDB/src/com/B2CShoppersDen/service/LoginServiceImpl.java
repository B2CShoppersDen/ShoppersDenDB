package com.B2CShoppersDen.service;

import java.sql.SQLException;

import com.B2CShoppersDen.View.CustomerView;
import com.B2CShoppersDen.dao.LoginDAO;
import com.B2CShoppersDen.helper.FactoryCustomerDB;
import com.B2CShoppersDen.model.LoginModel;

public class LoginServiceImpl implements LoginService{
   
	private LoginDAO loginDAO=null;
	
	public LoginServiceImpl() {
		this.loginDAO=FactoryCustomerDB.createLoginDAO();
	}

	@Override
	public String userAuthenticationService(LoginModel loginModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String result="fail";
				boolean userValid=loginDAO.userAuth(loginModel.getUserId(),loginModel.getPassword());
		        if(userValid) {
		        	result="success";}
		        	else {
		        		CustomerView customerView=new CustomerView();
		        		customerView.showLoginFailure();
		        	}
		return result;
	}
}
