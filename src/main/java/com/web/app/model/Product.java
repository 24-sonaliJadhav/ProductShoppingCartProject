package com.web.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String productName;
	
	 @Column(name="CATEGORY")
	private String category;
	 
	 @Column(name="COMPANY")
	private String company;
	 
	 @Column(name="COLOR")
	private String color;
	 
	 @Column(name="DESCRIPTION")
	private String description;
	 
	 @Column(name="PRICE")
	private double price;
	 
	 @Column(name="DISCOUNT")
	private double discount;
	 
	 @Column(name="STOCK")
	private int noOfIteamInStock;
	
	public Product(){
		
	}
	
	public Product(String category, String company, String productName, String color, String description, double price,
			double discount, int noOfIteamInStock) {
		super();
		this.category = category;
		this.company = company;
		this.productName = productName;
		this.color = color;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.noOfIteamInStock = noOfIteamInStock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getNoOfIteamInStock() {
		return noOfIteamInStock;
	}
	public void setNoOfIteamInStock(int noOfIteamInStock) {
		this.noOfIteamInStock = noOfIteamInStock;
	}
	@Override
	public String toString() {
		return "Product [category=" + category + ", company=" + company + ", productName=" + productName + ", color="
				+ color + ", description=" + description + ", price=" + price + ", discount=" + discount
				+ ", noOfIteamInStock=" + noOfIteamInStock + "]";
	}
	
	
}
