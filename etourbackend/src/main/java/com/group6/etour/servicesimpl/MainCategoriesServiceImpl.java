package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.MainCategories;
import com.group6.etour.repository.MainCategoriesDao;
import com.group6.etour.services.MainCategoriesService;

@Service
public class MainCategoriesServiceImpl implements MainCategoriesService
{

	@Autowired
	MainCategoriesDao maincatdao;
	
	@Override
	public MainCategories addMainCategory(MainCategories maincategory) {
		// TODO Auto-generated method stub
		maincatdao.save(maincategory);
		return maincategory ;
	}

	
	
	
}
