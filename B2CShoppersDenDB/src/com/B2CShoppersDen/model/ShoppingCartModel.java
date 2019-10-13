package com.B2CShoppersDen.model;

public class ShoppingCartModel {
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public  ShoppingCartModel(){
		
	}
	public int getProductId() {
		return productId;
	}
    public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
    public void setProductName(String productName) {
		this.productName = productName;
	}
    public double getPrice() {
		return price;
	}
    public void setPrice(double price) {
		this.price = price;
	}
    public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
		}


	@Override
	public String toString() {
		return "ShoppingCartModel [productId=" + productId + ", productName="
				+ productName + ", price=" + price + ", quantity=" + quantity
				+ ", getProductId()=" + getProductId() + ", getProductName()="
				+ getProductName() + ", getPrice()=" + getPrice()
				+ ", getQuantity()=" + getQuantity() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productId;
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantity;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingCartModel other = (ShoppingCartModel) obj;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
}	
	
	
	
	
	
	
	
	

