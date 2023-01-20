package com.example.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.Product;
import com.example.assignment.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pRepository;
	
	@Override
	public List<Product> getProducts() {

		return pRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return pRepository.save(product);
	}

//
	@Override
	public Product getSingleProduct(Long Id) {

		Optional<Product> product = pRepository.findById(Id);
		if (product.isPresent()) {
			return product.get();
		}
		throw new RuntimeException("Product is not Found");
	}

	@Override
	public void deleteProduct(Long Id) {
		pRepository.deleteById(Id);

	}

	@Override
	public Product updateProduct(Product product) {
		return pRepository.save(product);
	}

//	@Override
//	public List<Product> getProductByColor(String Color) {
//		return pRepository.findByColor(Color);
//	}
//
//	@Override
//	public List<Product> getProductByWeigth(String Wiegth) {
//		return pRepository.FindByWeigth(Wiegth);
//	}

	

}
