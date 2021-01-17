package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.PackageItinery;
import com.group6.etour.repository.PackageItineryDao;
import com.group6.etour.services.PackageItineryService;

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
