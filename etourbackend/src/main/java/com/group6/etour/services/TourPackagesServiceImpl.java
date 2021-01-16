package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.TourPackagesDao;
import com.group6.etour.entity.TourPackages;

@Service
public class TourPackagesServiceImpl implements TourPackagesService {

	@Autowired
	private TourPackagesDao tourpackagesDao;
	@Override
	public TourPackages addTourPackages(TourPackages tourpack) {
		// TODO Auto-generated method stub
		tourpackagesDao.save(tourpack);
		return tourpack;
	}

}
