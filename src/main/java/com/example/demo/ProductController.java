package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	
	@Autowired
	ProductRepository productRepository;
	
	
	@GetMapping("/products")
	public ResponseEntity<?> getAllProducts(){
		return ResponseEntity.ok(productRepository.findAll());
	}
	
	
	

}
