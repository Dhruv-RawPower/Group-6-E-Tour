package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.Customer;
import com.group6.etour.repository.CustomerDao;
import com.group6.etour.services.CustomerService;

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
