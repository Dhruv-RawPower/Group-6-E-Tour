package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.CustomerDao;
import com.group6.etour.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer addCustomer(Customer customer) 
	{
		// TODO Auto-generated method stub
		customerDao.save(customer);
		return customer;
	}

}
