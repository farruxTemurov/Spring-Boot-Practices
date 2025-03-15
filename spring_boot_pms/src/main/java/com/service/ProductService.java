package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;

	public String storeProduct(Product product) {
		productDao.save(product); // save is predefined method of JpaRepository
		return "Product Saved";
	}

	public List<Product> findAllProducts() {

		return productDao.findAll();

	}
}
