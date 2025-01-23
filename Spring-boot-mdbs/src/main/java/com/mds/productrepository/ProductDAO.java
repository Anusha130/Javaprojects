package com.mds.productrepository;

import org.springframework.data.repository.CrudRepository;

import com.mds.entity.Product;

public interface ProductDAO extends CrudRepository<Product,Integer>{
	
	

}
