package com.example.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.assignment.model.Detail;
import com.example.assignment.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//
//	@Query("Select * from product_tbl INNER JOIN product_detail on prodcut_tbl.Id=prodcut_detail.product_tbl.Id where product_detail.color=white")
//	List<Product> findByColor(String color);
//		List<Product>FindByWeigth(String Weigth);
}
