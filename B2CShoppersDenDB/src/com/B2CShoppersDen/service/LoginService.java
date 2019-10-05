package com.B2CShoppersDen.service;

import java.sql.SQLException;

import com.B2CShoppersDen.model.LoginModel;

public interface LoginService {
	
	public String userAuthenticationService(LoginModel loginmodel)throws ClassNotFoundException,SQLException;
	

}
