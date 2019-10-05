package com.B2CShoppersDen.View;

import java.util.Scanner;

import com.B2CShoppersDen.controller.CustomerController;
import com.B2CShoppersDen.model.RegisterCustomerModel;

public class CustomerView {
	public void customerMenu()
	{
		try(
				Scanner scanner=new Scanner(System.in);
				
			){
			System.out.println("Customer View");
			System.out.println(" 1.View Product");
			System.out.println("2.Add to Cart");
			System.out.println("3.view cart products");
			System.out.println("4.payment");
			
			System.out.println("Enter your Choice");
			
			int option=scanner.nextInt();
			
			CustomerController customerController=new CustomerController();
			switch(option)
			{
			case 1: customerController.viewProduct();
					break;
			case 2: customerController.addToCart();
					break;
			case 3: customerController.viewCartProducts();
					break;
			case 4: customerController.viewPayment();
					break;
		
			default: System.out.println("!ERROR [SELECT APPROPRIATE OPTION");
			customerMenu();
			}
		}
	catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void showRegistrationSuccess(RegisterCustomerModel model) {
		// TODO Auto-generated method stub
		System.out.println("Registration Successful for CustomerId->"+model.getCustomerId());
		
	}
	public void showRegistrationFailure(RegisterCustomerModel model) {
		System.out.println("Registration Unsuccessful for CustomerId->"+model.getCustomerId());
	}
	public void validationFailedError() {
		// TODO Auto-generated method stub
		System.out.println("Data Validation Failed ");
	}
	public void LoginFailedError() {
		// TODO Auto-generated method stub
		System.out.println("login failed!!");
	}
	public void showLoginFailure() {
		// TODO Auto-generated method stub
		System.out.println("==========!! Login failed-invalid credentials !! ");
	}
	

}
