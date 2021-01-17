package com.group6.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group6.etour.entity.SubCategories;

public interface SubCategoriesDao extends JpaRepository<SubCategories, Long>
{
	@Query("from SubCategories")
	public List<Object> getSubCategories();

}
