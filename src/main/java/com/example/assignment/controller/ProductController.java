package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.Detail;
import com.example.assignment.model.Product;
import com.example.assignment.service.DetailService;
import com.example.assignment.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService pService;
	@Autowired
	private DetailService dService;

	@GetMapping("/products")
	public List<Product> getProducts() {
		return pService.getProducts();
	}

	@GetMapping("/details")
	public List<Detail> getDetails() {
		return dService.getDetails();
	}

	@GetMapping("/products/{Id}")
	public Product getProduct(@PathVariable("Id") Long Id) {
		return pService.getSingleProduct(Id);
	}

	@DeleteMapping("/products/{Id}")
	public void deleteProduct(@PathVariable("Id") Long Id) {
		pService.deleteProduct(Id);
	}

	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return pService.saveProduct(product);
	}

	@PutMapping("/products/{Id}")
	public Product updatingProduct(@PathVariable("Id") Long Id, @RequestBody Product product) {
		product.setId(Id);
		return pService.updateProduct(product);
	}

//	@GetMapping("/products/FilterByColor")
//	public List<Product> getProductByColor(@RequestParam String Color) {
//		return pService.getProductByColor(Color);
//	}
//
//	@GetMapping("/products/FilterByWeigth")
//	public List<Product> getProductByWeigth(String Weigth) {
//		return pService.getProductByColor(Weigth);
//	}

}
