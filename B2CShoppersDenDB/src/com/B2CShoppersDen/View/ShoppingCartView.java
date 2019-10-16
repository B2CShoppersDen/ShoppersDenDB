package com.B2CShoppersDen.View;

import java.util.Scanner;

import org.omg.CORBA.Request;

import com.B2CShoppersDen.controller.ShoppingCartController;

public class ShoppingCartView {
	

	public void viewShoppingCartMenu(Object RequestType) {
		
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.println("1.view productId");
			System.out.println("2.view productName");
			System.out.println("3.view price");
			System.out.println("4.view quantity");
			System.out.println("5.display amount");
			System.out.println();
			
			
			System.out.println("Enter choice:");
			
			int option=scanner.nextInt();
			
			ShoppingCartController shoppingCartController=new ShoppingCartController();
			
			
			if(option==1)
				shoppingCartController.handleRetrieveShoppingCart(RequestType.PRODUCTID);
			
			if(option==2)
				shoppingCartController.handleRetrieveShoppingCart(RequestType.PRODUCTNAME);
			
			if(option==3)
				shoppingCartController.handleRetrieveShoppingCart(RequestType.PRICE);
			if(option==4)
				shoppingCartController.handleRetrieveShoppingCart(RequestType.QUANTITY);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			
			
			
		}
	}

