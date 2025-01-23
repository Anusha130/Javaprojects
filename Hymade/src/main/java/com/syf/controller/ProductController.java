package com.syf.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syf.model.Product;
import com.syf.model.Refernce;
import com.syf.service.ProductService;

@RequestMapping("/add")
@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return service.addproduct(product);
	}

	/*
	 * @GetMapping("/getall") public List<Product> getProducts(){ return
	 * service.getAll(); }
	 */
	  @PostMapping("/getByBranchdealerAndpromocode")
	    public ResponseEntity<Map<String, Object>> getByBranchDealerAndPromocode(@RequestBody Refernce ref) {
	        try {
	            Map<String, Object> result = service.getProducts(
	                ref.getBranch(),
	                ref.getDealer(),
	                ref.getPromocode(),
	                ref.isBranchdealers(),
	                ref.isProgramcode()
	            );
	            return ResponseEntity.ok(result);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Internal server error"));
	        }
	    }

}
