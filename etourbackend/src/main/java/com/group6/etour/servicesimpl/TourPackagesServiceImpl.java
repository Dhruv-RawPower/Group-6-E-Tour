package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.TourPackages;
import com.group6.etour.repository.TourPackagesDao;
import com.group6.etour.services.TourPackagesService;


@Service
public class TourPackagesServiceImpl implements TourPackagesService 
{

	@Autowired
	private TourPackagesDao tourpackagesDao;
	@Override
	public TourPackages addTourPackages(TourPackages tourpack)
	{
		// TODO Auto-generated method stub
		tourpackagesDao.save(tourpack);
		return tourpack;
	}
}
