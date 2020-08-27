package com.web.app.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.web.app.model.Product;
import com.web.app.service.WebAppProductService;

@RestController
@RequestMapping("/products")
public class WebAppController {

	@Autowired
	WebAppProductService webAppProductService;
	
	//Retrieve All the products across all the categories
	@GetMapping
	public List<Product> getAllProducts(){
		return webAppProductService.getAllProductDetails();
	}
	
	//Retrieve All the products across by category
	@GetMapping("/{category}")
	public List<Product> getProductDetailsByCategory(@PathVariable String Category){
		return webAppProductService.getProductDetailsByCategory(Category);
		
	}
	
	//Retrieve All the products across by company
	@GetMapping("/{company}")
	public List<Product> getProductDetailsByCompany(@PathVariable String company){
		return webAppProductService.getProductDetailsByCompany(company);
		
	}
	
	//Retrieve discount price of all the products by category
	@GetMapping("/{category}")
	public List<Product> getProductDetailsByDiscount(@PathVariable String category){
		return webAppProductService.getProductDetailsByDiscount(category);
		
	}
	
	
	// Create new product
	@PostMapping
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok().body(this.webAppProductService.addProductDetails(product));
    }
	
	// delete existing product
	@DeleteMapping("/{productName}")
	public void deleteProduct(@PathVariable String productName){
		webAppProductService.deleteProductDetails(productName);
			}
	
}
