package com.B2CShoppersDen.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import com.B2CShoppersDen.exception.ValidationException;

import com.B2CShoppersDen.model.RegisterCustomerModel;
import com.B2CShoppersDen.validation.CustomerModelValidator;
import com.B2CShoppersDen.controller.CustomerController;
import com.B2CShoppersDen.controller.FrontController;

public class MainView {

	public void mainMenu() {
		// TODO Auto-generated method stub
	
		System.out.println("=====MainMenu=====");
		System.out.println("1.Admin");
		System.out.println("2.Customer");
		System.out.println("3.Exit");
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.println("Enter Your Option");
			int option=scanner.nextInt();
			
			switch(option) {
			case 1: viewLoginMenu();
					break;
			case 2: viewCustomerMenu();
			        break;
			
			default:System.out.println("!ERROR [SELECT APPROPRIATE OPTION");
					mainMenu();
			}
		}	catch(Exception e)
		{
				System.out.println("!ERROR [SELECT APPROPRIATE OPTION");
		}
	}

	public void viewLoginMenu() throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		try(
				InputStreamReader reader =
							new InputStreamReader(System.in);
				BufferedReader buffer=
							new BufferedReader(reader);
				){
				
			System.out.println("User Id:");
			String userId=buffer.readLine().trim();
			
			System.out.println("password");
			String password=buffer.readLine().trim();
			
			FrontController controller=new FrontController();
			controller.userAuthentication(userId,password);
		}
		catch(IOException e) {
		e.printStackTrace();
	}
	
	}

	public void viewCustomerMenu() {
		// TODO Auto-generated method stub
		try(
				Scanner 
				
				
				scanner=new Scanner(System.in);
				
			){
			System.out.println("login");
			System.out.println("Register");
			System.out.println("Main Menu");
			System.out.println("Enter Your Choice");
			
			int option=scanner.nextInt();
			switch(option)
			{
			case 1: viewLoginMenu();
					break;
			
			case 2: registerCustomerForm();
					break;
			
			case 3: mainMenu();
			
			default: System.out.println("!ERROR [SELECT APPROPRIATE OPTION");
			
			viewCustomerMenu();	
			
			}
		}catch(Exception e)	{
				e.printStackTrace();
			}
		
		}
	
	public void registerCustomerForm()
		{
			try(Scanner scanner=new Scanner(System.in);){
				
				System.out.println("Customer Id");
				int Customerid=scanner.nextInt();
				CustomerModelValidator validator=new CustomerModelValidator();
				System.out.println("First Name:");
				String firstName=scanner.next();
				
				boolean validFirstName=validator.validString(firstName);
				if(!validFirstName)
				try {
						throw new ValidationException("[!ERROR INVALID First Name]");
					}
					catch(ValidationException e) {
					System.out.println(e.getMessage());
					mainMenu();
					}
					
					System.out.println("last Name");
					String lastName=scanner.next();
					
					boolean validLastName=validator.validString(lastName);
					if(!validLastName)
					try
						{
							throw new ValidationException("[ERROR INVALID Last Name]");
						}
					catch(ValidationException e)
					{
						System.out.println(e.getMessage());
						mainMenu();
					}
					
					System.out.println("Email");
					String email=scanner.next();
					
					boolean validEmail=validator.validEmail(email);
					if(!validEmail)
					try
					{
						throw new ValidationException("[ERROR INVALID EMAIL");
					}
					catch(ValidationException e)
					{
						System.out.println(e.getMessage());
						mainMenu();
					}
					System.out.println("phone number");
					String phoneNumber=scanner.next();
					System.out.println("userId");
					int customerId=scanner.nextInt();
					System.out.println("password");
					String password=scanner.next();
				
				RegisterCustomerModel model=new RegisterCustomerModel();
				model.setCustomerId(customerId);
				model.setFirstName(firstName);
				model.setLastName(lastName);
				model.setEmail(email);
				model.setPhoneNumber(phoneNumber);
				model.setPassword(password);
				
			CustomerController controller=new CustomerController();
				controller.handleRegisterEmployee(model);
				mainMenu();
				
				}catch(Exception e){
					
				}
			
			
		}

	public void viewProductMenu() {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	

		
	
	

	
	
		
			
	
	
		

