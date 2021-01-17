package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}
