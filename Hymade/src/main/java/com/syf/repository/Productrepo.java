package com.syf.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.syf.model.Product;

@Repository
public interface Productrepo extends CrudRepository<Product, Integer> {

	@Query(value = "select * from product where branch =?1 and dealer =?2", nativeQuery = true)
	List<Product> findByBranchAndDealer(String branch, String dealer);

	@Query(value = "select * from product where promocode =?1", nativeQuery = true)
	List<Product> findByPromocode(String promocode);

	// @Query(value = "SELECT * FROM product p WHERE (:brand IS NULL OR p.brand LIKE
	// %:brand%) AND (:dealer IS NULL OR p.dealer LIKE %:dealer%) AND (:product IS
	// NULL OR p.product LIKE %:product%)", nativeQuery = true)

	// @Query(value ="select * from Product where branch =?1 and dealer = ?2,and
	// promocode=?3",nativeQuery = true)
	// List<Product> getbranchdelaerandPromocode(String branch, String dealer);

	// @Query(value ="select * from product where promocode =?1",nativeQuery =true)
	// List<Product> getPromocode(String promocode);

	// @Query(value ="select * from Product where branch =?1 and dealer = ?2,and
	// promocode=?3",nativeQuery = true)
	// List<Product> findByBranchAndDealer(String branch, String dealer);

	// @Query(value ="select * from product where promocode =?1",nativeQuery =true)
	// List<Product> findByPromocode(String promocode);

}
