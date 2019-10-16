package com.B2CShoppersDen.helper;

public enum RequestType {
PRODUCTID("Productid"),PRODUCTNAME("productname"),PRICE("price"),QUANTITY("quantity");
	
	private String val;
	private RequestType(String val) {
		
		this.val=val;
	}
	
	public String getVal() {
		return val;
	}
}
