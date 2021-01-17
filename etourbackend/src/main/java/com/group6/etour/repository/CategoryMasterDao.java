package com.group6.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group6.etour.entity.CategoryMaster;



public interface CategoryMasterDao  extends JpaRepository<CategoryMaster, Long>  
{
	@Query(value = "SELECT * FROM category_master where category_master.subcat_id is not null", nativeQuery = true)
    public List<CategoryMaster> getSubCategory();	
}
