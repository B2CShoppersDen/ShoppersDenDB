package com.B2CShoppersDen.entities;

public class Product {
	
	private String productImageUrl;
	private int productId;
	private String productDescription;
	private double productPrice;
	private String productCategory;
	private String productName;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImageUrl(){
		return productImageUrl;
	}
	public void setProductImageUrl(String imageUrl) {
		this.productImageUrl = imageUrl;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double price) {
		this.productPrice = price;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String category) {
		this.productCategory = category;
	}
	@Override
	public String toString() {
		return "Product [imageUrl=" + productImageUrl + ", productId=" + productId + ", productDescription="
				+ productDescription + ", price=" + productPrice + ", category=" + productCategory + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + ((productImageUrl == null) ? 0 : productImageUrl.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + productId;
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
		Product other = (Product) obj;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productImageUrl == null) {
			if (other.productImageUrl != null)
				return false;
		} else if (!productImageUrl.equals(other.productImageUrl))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	
	

}
