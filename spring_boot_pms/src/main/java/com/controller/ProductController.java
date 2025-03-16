package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String openIndexPage(Model mm, Product product) { // DI for model api
		System.out.println("Open Index Page");
		mm.addAttribute("pp", product);
		mm.addAttribute("name", "Temurov"); 
		return "index";
	}

	@RequestMapping(value = "/storeProduct", method = RequestMethod.POST)
	public String storeProduct(Model mm, Product product) {

		String result = productService.storeProduct(product);
		product.setId(0);
		product.setName("");
		product.setPrice(0.0f); // reset value not to display once again on the same form.
		mm.addAttribute("name", "Temurov");
		mm.addAttribute("pp", product); // we store product object in model scope
		mm.addAttribute("msg", result);
		return "index";
	}
}
