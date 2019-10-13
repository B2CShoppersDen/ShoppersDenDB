package com.B2CShoppersDen.View;

import java.util.Scanner;

import com.B2CShoppersDen.controller.AdminController;
import com.B2CShoppersDen.model.ProductModel;

public class AdminView {
	public void adminView() {
		try(
				Scanner scanner=new Scanner(System.in);
				
			){
			System.out.println("Admin View");
			System.out.println("1.Add Product");
			System.out.println("2.Delete Product");
			System.out.println("3.Update Product");
			System.out.println("4.View Transactions");
			
			System.out.println("Enter your Choice");
			
			int option=scanner.nextInt();
			
			AdminController adminController=new AdminController();
			switch(option)
			{
			case 1: adminController.addProduct();
					break;
					
			case 2: 
				System.out.println("Enter ProductId");
		        int id =scanner.nextInt();
				adminController.deleteProduct(id);
					break;
					
					
			case 3: 
				 System.out.println("Enter ProductId");
			        int productId =scanner.nextInt();
			        System.out.println("Enter New Price");
			        double newPrice = scanner.nextDouble();
				
				adminController.updateProduct(productId,newPrice);
					break;
					
			case 4: 
				System.out.println("Enter Transaction Id");
				int transactionId = scanner.nextInt();
				
				adminController.viewTransaction(transactionId);
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

	public ProductModel retriveProduct() {
		// TODO Auto-generated method stub
		
		ProductModel productModel = new ProductModel();
		productModel.getProductImageUrl();
		productModel.getProductCategory();
		productModel.getProductPrice();
		productModel.getProductDescription();
		productModel.getProductId();
		productModel.getProductName();
		
		return productModel;
	
	}
	
	 
	
	
	
	
	
	
	}


