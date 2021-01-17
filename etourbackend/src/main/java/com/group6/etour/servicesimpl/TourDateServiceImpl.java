package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.TourDate;
import com.group6.etour.repository.TourDateDao;
import com.group6.etour.services.TourDateService;

@Service
public class TourDateServiceImpl implements TourDateService {

	@Autowired
	private TourDateDao tourdateDao;
	
	@Override
	public TourDate addTourDate(TourDate tourdate) {
		// TODO Auto-generated method stub
		tourdateDao.save(tourdate);
		
		return tourdate;
	}

}
