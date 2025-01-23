package com.springdemo.repo;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;

import com.springdemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Serializable>{

}
