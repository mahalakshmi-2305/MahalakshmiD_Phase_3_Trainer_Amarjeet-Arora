package com.model;

import java.util.Arrays;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	String productName;
	String productDesc;
	int price;
	String stock;
	String shippingdetails;
	@Lob
	byte[] productphoto;
	
	
	public Product() {
			
	}
	
	

	public Product(int productId, String productName, String productDesc, int price, String stock,
			String shippingdetails, byte[] productphoto) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.stock = stock;
		this.shippingdetails = shippingdetails;
		this.productphoto = productphoto;
	}



	public Product(String productName, String productDesc, int price, String stock,
			String shippingdetails, byte[] productphoto) {
		super();
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.stock = stock;
		this.shippingdetails = shippingdetails;
		this.productphoto = productphoto;
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

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getShippingdetails() {
		return shippingdetails;
	}

	public void setShippingdetails(String shippingdetails) {
		this.shippingdetails = shippingdetails;
	}

	public byte[] getProductphoto() {
		return productphoto;
	}

	public void setProductphoto(byte[] productphoto) {
		this.productphoto = productphoto;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", price=" + price + ", stock=" + stock + ", shippingdetails=" + shippingdetails + ", productphoto="
				+ Arrays.toString(productphoto) + "]";
	}

	 public Product updateWith(Product product) {
	        return new Product(
	            this.productId,
	            product.productName,
	            product.productDesc,
	            product.price,
	            product.stock,
	            product.shippingdetails,
	            product.productphoto
	        );
	    }

	
	
	

}
