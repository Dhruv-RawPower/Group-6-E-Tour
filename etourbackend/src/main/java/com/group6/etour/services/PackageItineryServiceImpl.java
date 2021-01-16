package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.PackageItineryDao;
import com.group6.etour.entity.PackageItinery;

@Service
public class PackageItineryServiceImpl implements PackageItineryService {

	@Autowired
	private PackageItineryDao packageitineryDao;
	@Override
	public PackageItinery addPackageItinery(PackageItinery packitinery) {
		// TODO Auto-generated method stub
		packageitineryDao.save(packitinery);
		return packitinery;
	}

}
