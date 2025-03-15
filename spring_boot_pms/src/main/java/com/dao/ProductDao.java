package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
