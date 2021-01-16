package com.group6.etour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.CategoryMasterDao;
import com.group6.etour.entity.CategoryMaster;

@Service
public class CategoryMasterServiceImpl implements CategoryMasterService {

	@Autowired
	private CategoryMasterDao categorymasterDao;
	
	@Override
	public CategoryMaster addCategoryMaster(CategoryMaster catmas) 
	{
		// TODO Auto-generated method stub
		
		categorymasterDao.save(catmas);
		return catmas;
	}

	@Override
	public List<CategoryMaster> getCategories() 
	{
		// TODO Auto-generated method stub
		return categorymasterDao.findAll();
		
	}

}
