package com.web.app.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.app.model.Product;

@Repository
public abstract class WebAppProductRepositoryImpl implements WebAppProductRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	Session session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProdDetails() {
		Session session=sessionFactory.getCurrentSession();
		List<Product> list=new ArrayList<Product>();
		list=(List<Product>) session.createQuery("from Product",Product.class);
		
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductDetailsByCategory(String Category) {
		Session session=sessionFactory.getCurrentSession();
		List<Product> list=new ArrayList<Product>();
		list=(List<Product>) session.get(Product.class,Category);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductDetailsByCompany(String Company) {
		Session session=sessionFactory.getCurrentSession();
		List<Product> list=new ArrayList<Product>();
		list=(List<Product>) session.get(Product.class,Company);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductDiscount(String Category) {
		Session session=sessionFactory.getCurrentSession();
		List<Product> list=new ArrayList<Product>();
		list=(List<Product>) session.get(Product.class,Category);
		return list;
	}

	@Override
	public String addProductDetails(Product addProduct) {
		Session session=sessionFactory.getCurrentSession();
		session.save(addProduct);
		return session.getEntityName(addProduct);
	}

	@Override
	public String deleteProductDetails(String productName) {
		Session session=sessionFactory.getCurrentSession();
		Product deleteProd=new Product();
		if(deleteProd.getProductName()==productName){
			session.delete(deleteProd);
		}
		
		return "Deleted Successfully";
	}
	

}
