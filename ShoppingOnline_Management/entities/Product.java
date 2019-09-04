package com.aptech.shoppingonline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(name = "productid", length = 20, nullable = false)
	private String productId;
	
	@Column(name = "productname", length = 255, nullable = false)
	private String productName;
	
	@Column(name = "supplier", nullable = false)
	private String suplier;
	
	@Column(name = "producttype")
	private String productType;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@Column(name = "product_desc")
	private String productDesc;

	public Product() {
		super();
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSuplier() {
		return suplier;
	}

	public void setSuplier(String suplier) {
		this.suplier = suplier;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	
}
