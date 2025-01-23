package com.syf.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syf.model.Product;
import com.syf.repository.Productrepo;

@Service
public class ProductService {
	@Autowired
	private Productrepo repo;

	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	/*
	 * public List<Product> getAll() { // TODO Auto-generated method stub return
	 * repo.findAll(); }
	 */public void hello() {
		System.out.println("hello from void");
	}

	/*
	 * public List<Product> getProducts(String branch, String dealer, String
	 * promocode, boolean isBranchdealer, boolean isPromocode) {
	 * //System.out.println("hello");
	 * 
	 * return isBranchdealer && !isPromocode ?
	 * repo.getbranchdelaerandPromocode(branch, dealer) : isPromocode &&
	 * !isBranchdealer ? repo.getPromocode(promocode) : Collections.emptyList();
	 * 
	 * 
	 * // TODO Auto-generated method stub
	 * 
	 * }
	 */
	List<Product> products = new ArrayList<>();

	/*
	 * public List<Product> getProducts(String branch, String dealer, String
	 * promocode, boolean isBranchdealer, boolean isPromocode) { // List<Product>
	 * products = new ArrayList<>();
	 * 
	 * if (isBranchdealer && !isPromocode) { // Query by branch and dealer if
	 * (branch != null && !branch.isEmpty() && dealer != null && !dealer.isEmpty())
	 * { products = repo.findByBranchAndDealer(branch, dealer);
	 * products.add(branch,dealer); }
	 * 
	 * } else if (isPromocode && !isBranchdealer) { // Query by promocode if
	 * (promocode != null && !promocode.isEmpty()) { products =
	 * repo.findByPromocode(promocode); } }
	 * 
	 * 
	 * return products;
	 * 
	 * }
	 */
	/*
	 * public Map<Product,String> getProducts(String branch, String dealer, String
	 * promocode, boolean isBranchdealer, boolean isPromocode) { Map<Product,String>
	 * map = new HashMap<>(); if(isBranchdealer){ map.put("branch","true"); return
	 * repo.findByBranchAndDealer(branch, dealer);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * return branch;
	 */public Map<String, Object> getProducts(String branch, String dealer, String promocode, boolean isBranchdealers, boolean isProgramcode) {
		    Map<String, Object> response = new HashMap<>();
		  //  List<Product> products = new ArrayList<>();
		    String description = "";
		    int a =2;
		  //if(isBranchdealers) {
		    	System.out.println("hi");
	   if (isBranchdealers || !isProgramcode) {
		   response.put("products", repo.findByBranchAndDealer(branch, dealer));
		   System.out.println("hi11111");
	        
	        }
	   else if(isProgramcode && !isBranchdealers){
		   response.put("products", repo.findByPromocode(promocode));
	   }
	   //   products = repo.findByBranchAndDealer(branch, dealer);
       //  description = "Found by branch and dealer";
         
        // System.out.println("branch and dealer yeah");
	   // if(isProgramcode || !isBranchdealers){
		  // products = repo.findByPromocode(promocode);
           //description = "Found by promocode";
          // System.out.println("hello promo");
         
	//   }
		   
	  
		
		//response.put("products", repo.findByBranchAndDealer(branch, dealer));
	
		//response.put("products", repo.findByPromocode(promocode));
	   
		
		
	
		    return response;
	 }
	 }
