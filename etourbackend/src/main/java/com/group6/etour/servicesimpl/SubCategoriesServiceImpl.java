package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.SubCategories;
import com.group6.etour.repository.SubCategoriesDao;
import com.group6.etour.services.SubCategoriesService;

@Service
public class SubCategoriesServiceImpl implements SubCategoriesService {

	@Autowired
	private SubCategoriesDao subcatDao;
	
	@Override
	public SubCategories addSubCategory(SubCategories subcategory) 
	{
		subcatDao.save(subcategory);
		return subcategory;
	}

}
