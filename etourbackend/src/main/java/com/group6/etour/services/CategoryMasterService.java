package com.group6.etour.services;

import java.util.List;

import com.group6.etour.entity.CategoryMaster;


public interface CategoryMasterService 
{
	public CategoryMaster addCategoryMaster(CategoryMaster catmas);

	public List<CategoryMaster> getCategories();

	
		
}
