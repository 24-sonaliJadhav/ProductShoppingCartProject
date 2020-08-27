package com.web.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.app.model.Product;

public interface WebAppProductService {

	public List<Product> getAllProductDetails();
	
	public List<Product> getProductDetailsByCategory(String Category);
	
	public List<Product> getProductDetailsByCompany(String company);
	
	public List<Product> getProductDetailsByDiscount(String  Category);
	
	public String addProductDetails(Product addProduct);
	
	public String deleteProductDetails(String productName);
	
}
