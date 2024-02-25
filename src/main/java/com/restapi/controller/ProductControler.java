package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Product;
import com.restapi.repository.ProductRepository;

@RestController
public class ProductControler {
	
	@Autowired
	ProductRepository repo;
	//get all the students 
	//localhost:8080/students
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		 List<Product> products = repo.findAll();
		  return products;
	}
	
	//localhost:8080/students/1
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable int id) {
		Product product = repo.findById(id).get();
		
		return product;
	}
	
	@PostMapping("/product/add")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product newProduct = repo.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
	}
	
	@PutMapping("/product/update/{id}")
	public Product updateProducts(@PathVariable int id) {
	   Product product = repo.findById(id).get();
	   product.settitle("poonam");
	   product.setprice(92);
	   repo.save(product);
	   return product;
	}
	
	@DeleteMapping("/product/delete/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeProduct(@PathVariable int id) {
		Product product = repo.findById(id).get();
		repo.delete(product);
	}

}
