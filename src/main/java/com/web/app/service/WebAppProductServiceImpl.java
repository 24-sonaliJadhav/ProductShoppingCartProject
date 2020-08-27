package com.web.app.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.app.dao.WebAppProductRepository;
import com.web.app.model.Product;


@Service
@Transactional
public class WebAppProductServiceImpl implements WebAppProductService {

	@Autowired
	WebAppProductRepository webAppProductRepository;
	@Override
	public List<Product> getAllProductDetails() {

		return webAppProductRepository.getAllProdDetails();
	}
	
	
	@Override
	public List<Product> getProductDetailsByCategory(String Category) {
	
		return webAppProductRepository.getProductDetailsByCategory(Category);
	}
	
	@Override
	public List<Product> getProductDetailsByCompany(String company) {
	
		return webAppProductRepository.getProductDetailsByCompany(company);
	}


	@Override
	public List<Product> getProductDetailsByDiscount(String  Category) {
		Product product=new Product();
		List<Product> list=new ArrayList<Product>();
		for(Product p: list){
			double dicountPrice=product.getPrice()*(product.getDiscount()/100);
			product.setDiscount(dicountPrice);			
		}
		return list;
	}


	@Override
	public String addProductDetails(Product addProduct) {
		return webAppProductRepository.addProductDetails(addProduct);
	}


	@Override
	public String deleteProductDetails(String productName) {
		
		return webAppProductRepository.deleteProductDetails(productName);
	}

}
