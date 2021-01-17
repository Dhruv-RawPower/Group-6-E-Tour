package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MainCategories 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="maincategory_id", unique = true, nullable = false)
	long maincategory_id;
	String main_category_name;
	String main_category_image;
	public MainCategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MainCategories(long maincategory_id, String main_category_name, String main_category_image) {
		super();
		this.maincategory_id = maincategory_id;
		this.main_category_name = main_category_name;
		this.main_category_image = main_category_image;
	}
	public long getMaincategory_id() {
		return maincategory_id;
	}
	public void setMaincategory_id(long maincategory_id) {
		this.maincategory_id = maincategory_id;
	}
	public String getMain_category_name() {
		return main_category_name;
	}
	public void setMain_category_name(String main_category_name) {
		this.main_category_name = main_category_name;
	}
	public String getMain_category_image() {
		return main_category_image;
	}
	public void setMain_category_image(String main_category_image) {
		this.main_category_image = main_category_image;
	}
	@Override
	public String toString() {
		return "MainCategories [maincategory_id=" + maincategory_id + ", main_category_name=" + main_category_name
				+ ", main_category_image=" + main_category_image + "]";
	}

	
}