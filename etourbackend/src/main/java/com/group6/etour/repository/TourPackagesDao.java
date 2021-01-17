package com.group6.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group6.etour.entity.TourPackages;


public interface TourPackagesDao extends JpaRepository<TourPackages, Long>
{
	@Query("from TourPackages")
	public List<TourPackages> getPackages();
	
	@Query(value="SELECT * FROM tour_packages join category_master on tour_packages.catmaster_id=category_master.catmaster_id where category_master.subcat_id is not null", nativeQuery = true)
	public List<TourPackages> getSubPackages();
	
}