package com.B2CShoppersDen.controller;

import java.util.List;

import com.B2CShoppersDen.View.MainView;
import com.B2CShoppersDen.View.ShoppingCartView;
import com.B2CShoppersDen.helper.FactoryShoppingCartDB;
import com.B2CShoppersDen.helper.RequestType;
import com.B2CShoppersDen.model.ShoppingCartModel;
import com.B2CShoppersDen.service.ShoppingCartService;

public class ShoppingCartController{
	
private ShoppingCartService shoppingCartService;
	
	public ShoppingCartController() {
		
		this.shoppingCartService=FactoryShoppingCartDB.createShoppingCartService();
		
		
	}
	
	public void handleRetrieveProducts(RequestType request) {
		
		
		ShoppingCartView shoppingCartView=new ShoppingCartView();
		
		List<ShoppingCartModel>models=ShoppingCartService.retrieveProducts();
		MainView mainView=new MainView();
		switch(request) {
		
		case PRODUCTID: productView.showProductId(models);
		mainView.viewProductMenu();
		break;
		
	    case PRODUCTNAME: productName.showProductName(models);
	    mainView.viewProductMenu();
	    break;
	    
	    case PRICE: productPrice.showProductPrice(models);
        mainView.viewProductMenu();
        break;

        case QUANTITY: productQuantity.showProductQuantity(models);
        mainView.viewProductMenu();
        break;
        
        default:
		      break;
	
        
              }

		
		
    	}
	
	
}

