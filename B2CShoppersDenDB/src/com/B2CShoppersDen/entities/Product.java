package com.B2CShoppersDen.entities;

public class Product {
	
	private String productImageUrl;
	private int productId;
	private String productDescription;
	private double productPrice;
	private String productCategory;
	private String productName;
	private int productQuantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImageUrl(){
		return productImageUrl;
	}
	public void setProductImageUrl(String productimageUrl) {
		this.productImageUrl = productimageUrl;
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
	public void setProductPrice(double productprice) {
		this.productPrice = productprice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productcategory) {
		this.productCategory = productcategory;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "Product [productImageUrl=" + productImageUrl + ", productId=" + productId + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productCategory=" + productCategory
				+ ", productName=" + productName + ", productQuantity=" + productQuantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productImageUrl == null) ? 0 : productImageUrl.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productQuantity;
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
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (productImageUrl == null) {
			if (other.productImageUrl != null)
				return false;
		} else if (!productImageUrl.equals(other.productImageUrl))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productQuantity != other.productQuantity)
			return false;
		return true;
	}
}
	