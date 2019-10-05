package com.B2CShoppersDen.controller;

import java.sql.SQLException;

//import com.B2CShoppersDen.View.CustomerView;
import com.B2CShoppersDen.View.ErrorView;
import com.B2CShoppersDen.View.MainView;
import com.B2CShoppersDen.exception.UserException;
//import com.B2CShoppersDen.helper.FactoryCustomerDB;
import com.B2CShoppersDen.model.LoginModel;
import com.B2CShoppersDen.service.LoginService;

public class FrontController {

	private LoginService loginService;
	
	public void userAuthentication(String userId,String password)throws ClassNotFoundException,SQLException {
	
	  LoginModel loginModel=new LoginModel();
	  loginModel.setUserId(userId);
	  loginModel.setPassword(password);
	  try {
		  String result=loginService.userAuthenticationService(loginModel);
		  if(result=="success") {
			  MainView mainView=new MainView();
		  }
		  else
		  {
			  ErrorView errorView=new ErrorView();
			  errorView.authenticationError();
		  }
	  }
	  catch(UserException e) {
		  
		  System.out.println("User Authentication failed");
	  }
	  
	 
}
}
