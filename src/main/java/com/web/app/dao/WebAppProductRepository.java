package com.web.app.dao;


import java.util.List;
import com.web.app.model.Product;


public interface WebAppProductRepository   {

	public  List<Product> getAllProdDetails();
	public List<Product> getProductDetailsByCategory(String Category);
	public List<Product> getProductDetailsByCompany(String Company);
	public List<Product> getProductDiscount(String  Category);
	public String addProductDetails(Product addProduct);
	public String deleteProductDetails(String productName);
}
