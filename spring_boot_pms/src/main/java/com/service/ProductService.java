package com.service;

import java.util.List;
import java.util.Optional;

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

	public String deleteProduct(int id) {
		if (productDao.existsById(id)) { // if record present return true else return false.
			productDao.deleteById(id); // no return type means void
			return "product record deleted";
		} else {
			return "product is not present";
		}
	}

	public String updateProduct(Product product) {

		Optional<Product> result = productDao.findById(product.getId());

		if (result.isPresent()) {
			Product p = result.get(); // retrieve that product object from db.
			p.setName(product.getName());
			p.setPrice(product.getPrice()); // replace new data.
			productDao.saveAndFlush(p); // update existing record with new information
			return "Product updated successfully";
		} else {
			return "product is not present";
		}
	}

	public Product findProductByPid(int id) {

		Optional<Product> result = productDao.findById(id);

		if (result.isPresent()) {
			Product p1 = result.get(); // retrieve that product object from db.
			return p1;
		} else {
			return null;
		}
	}
}
