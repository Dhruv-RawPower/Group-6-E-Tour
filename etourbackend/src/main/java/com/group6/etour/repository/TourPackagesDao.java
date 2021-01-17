package com.group6.etour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.group6.etour.entity.TourPackages;


public interface TourPackagesDao extends JpaRepository<TourPackages, Long>
{
	@Query("from TourPackages")
	public List<TourPackages> getPackages();
	
	@Query(value="SELECT * FROM tour_packages where subcategory_id=3;", nativeQuery = true)
	public List<Object[]> getkashmirsubpackages();
	/*@Query(value="SELECT tour_packages.package_id as tourpackid, tour_packages.package_name as tourpackname, tour_packages.photo as tourpackphoto FROM tour_packages join sub_categories \r\n"
			+ "on tour_packages.subcategory_id=sub_categories.subcategory_id where \r\n"
			+ "sub_categories.maincategory_id=1;", nativeQuery = true)
	public List<Object[]> getDomesticPackages();
	
	@Query(value="SELECT tour_packages.package_id as tourpackid, tour_packages.package_name as tourpackname, tour_packages.photo as tourpackphoto FROM tour_packages join sub_categories \r\n"
			+ "on tour_packages.subcategory_id=sub_categories.subcategory_id where \r\n"
			+ "sub_categories.maincategory_id=2;;", nativeQuery = true)
	public List<Object[]> getInternationalPackages();*/

	@Query(value="SELECT * FROM tour_packages where subcategory_id=4;",nativeQuery=true)
	public List<Object[]> getchardhamsubpackages();
	
}