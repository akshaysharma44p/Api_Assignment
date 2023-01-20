package com.example.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.model.Detail;
@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {
	
}
