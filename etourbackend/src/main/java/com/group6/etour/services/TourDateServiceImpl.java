package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.TourDateDao;
import com.group6.etour.entity.TourDate;

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
