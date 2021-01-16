package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="catmaster_id", unique = true, nullable = false)
	private long catmaster_id;
	String cat_id;
	String subcat_id;
	String cat_name;
	String cat_image_path;
	Boolean flag;
	public CategoryMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryMaster(long catmaster_id, String cat_id, String subcat_id, String cat_name, String cat_image_path,
			Boolean flag) {
		super();
		this.catmaster_id = catmaster_id;
		this.cat_id = cat_id;
		this.subcat_id = subcat_id;
		this.cat_name = cat_name;
		this.cat_image_path = cat_image_path;
		this.flag = flag;
	}
	public long getCatmaster_id() {
		return catmaster_id;
	}
	public void setCatmaster_id(long catmaster_id) {
		this.catmaster_id = catmaster_id;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(String subcat_id) {
		this.subcat_id = subcat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCat_image_path() {
		return cat_image_path;
	}
	public void setCat_image_path(String cat_image_path) {
		this.cat_image_path = cat_image_path;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "CategoryMaster [catmaster_id=" + catmaster_id + ", cat_id=" + cat_id + ", subcat_id=" + subcat_id
				+ ", cat_name=" + cat_name + ", cat_image_path=" + cat_image_path + ", flag=" + flag + "]";
	}
	
	
}