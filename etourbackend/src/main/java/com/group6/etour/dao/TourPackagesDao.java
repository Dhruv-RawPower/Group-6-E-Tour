package com.group6.etour.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.TourPackages;


public interface TourPackagesDao extends JpaRepository<TourPackages, Long>
{
	
}
