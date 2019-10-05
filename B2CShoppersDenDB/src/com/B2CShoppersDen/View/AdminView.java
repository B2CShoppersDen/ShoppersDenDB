package com.B2CShoppersDen.View;

import java.util.Scanner;

import com.B2CShoppersDen.controller.AdminController;

public class AdminView {
	public void adminView() {
		try(
				Scanner scanner=new Scanner(System.in);
				
			){
			System.out.println("Admin View");
			System.out.println("1.Add Product");
			System.out.println("2.Delete Product");
			System.out.println("3.View Product");
			System.out.println("4.View Transactions");
			
			System.out.println("Enter your Choice");
			
			int option=scanner.nextInt();
			
			AdminController adminController=new AdminController();
			switch(option)
			{
			case 1: adminController.addProduct();
					break;
			case 2: adminController.deleteProduct();
					break;
			case 3: adminController.viewProduct();
					break;
			case 4: adminController.viewTransaction();
					break;
			default: System.out.println("!ERROR [SELECT APPROPRIATE OPTION");
			adminView();
			}
		}
	catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	}


