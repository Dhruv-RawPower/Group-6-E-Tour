package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.PackageCostDao;
import com.group6.etour.entity.PackageCost;

@Service
public class PackageCostServiceImpl implements PackageCostService{

	@Autowired
	private PackageCostDao packagecostDao;
	
	@Override
	public PackageCost addPackageCost(PackageCost packcost) {
		// TODO Auto-generated method stub
		packagecostDao.save(packcost);
		return packcost;
		
	}
	

}
