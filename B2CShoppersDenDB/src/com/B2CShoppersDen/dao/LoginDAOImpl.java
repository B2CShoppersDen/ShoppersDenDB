package com.B2CShoppersDen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.B2CShoppersDen.integrate.ConnectionManager;

public class LoginDAOImpl implements LoginDAO{
	
    @Override
    public boolean userAuth(String userId,String password)throws ClassNotFoundException,SQLException {
    	//TODO Auto-generated method stub
    	
    	Connection connection=ConnectionManager.openConnection();
    	String query=". ....";
    	PreparedStatement preparedStatement=connection.prepareStatement(query);
    	    preparedStatement.setString(1, userId);
    	    preparedStatement.setString(2,password);
    	    ResultSet rs=preparedStatement.executeQuery();
    	    rs.next();
    	    if(rs.getInt(1)>0)
    	    	return true;
    	    else
    	    	return false;
    	    
    	
	
	}

}
