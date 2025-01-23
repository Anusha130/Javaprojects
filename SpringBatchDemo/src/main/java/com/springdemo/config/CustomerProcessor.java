package com.springdemo.config;

import org.springframework.batch.item.ItemProcessor;

import com.springdemo.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
