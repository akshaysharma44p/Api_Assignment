package com.example.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.model.Detail;
import com.example.assignment.model.Product;
import com.example.assignment.repository.DetailRepository;
@Service
public class DetailServiceimpl implements DetailService {
    
	@Autowired
	private DetailRepository dRepository;

	@Override
	public List<Detail> getDetails() {

		return dRepository.findAll();
	}

}
