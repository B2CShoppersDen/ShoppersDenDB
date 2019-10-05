package com.B2CShoppersDen.dao;

import java.sql.SQLException;

public interface LoginDAO{
 
	  public boolean userAuth(String userId,String password)throws ClassNotFoundException,SQLException;
	

}
