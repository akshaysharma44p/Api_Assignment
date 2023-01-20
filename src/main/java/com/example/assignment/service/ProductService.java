package com.example.assignment.service;

import java.util.List;

import com.example.assignment.model.Product;

public interface ProductService {
	List<Product> getProducts();

	Product saveProduct(Product product);

	Product getSingleProduct(Long Id);

	void deleteProduct(Long Id);

	Product updateProduct(Product product);

//	List<Product> getProductByColor(String Color);
//
//	List<Product> getProductByWeigth(String Wiegth);

}
