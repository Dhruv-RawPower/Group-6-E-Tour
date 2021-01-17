package com.group6.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group6.etour.entity.MainCategories;



public interface MainCategoriesDao extends JpaRepository<MainCategories, Long>
{
	@Query("from MainCategories")
	public List<MainCategories> getMainCategories();
}
