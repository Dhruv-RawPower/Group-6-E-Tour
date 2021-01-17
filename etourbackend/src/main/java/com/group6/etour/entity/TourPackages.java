package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TourPackages 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="package_id", unique = true, nullable = false)
	private long package_id;
	String package_name;
	String photo;
	
	long subcategory_id;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subcategory_id",referencedColumnName="subcategory_id",insertable=false,updatable=false)
	private SubCategories subcat;


	public TourPackages() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TourPackages(long package_id, String package_name, String photo, long subcategory_id, SubCategories subcat) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
		this.photo = photo;
		this.subcategory_id = subcategory_id;
		this.subcat = subcat;
	}


	public long getPackage_id() {
		return package_id;
	}


	public void setPackage_id(long package_id) {
		this.package_id = package_id;
	}


	public String getPackage_name() {
		return package_name;
	}


	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public long getSubcategory_id() {
		return subcategory_id;
	}


	public void setSubcategory_id(long subcategory_id) {
		this.subcategory_id = subcategory_id;
	}


	public SubCategories getSubcat() {
		return subcat;
	}


	public void setSubcat(SubCategories subcat) {
		this.subcat = subcat;
	}


	@Override
	public String toString() {
		return "TourPackages [package_id=" + package_id + ", package_name=" + package_name + ", photo=" + photo
				+ ", subcategory_id=" + subcategory_id + ", subcat=" + subcat + "]";
	}


	
}
