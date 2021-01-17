package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class SubCategories 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="subcategory_id", unique = true, nullable = false)
	long subcategory_id;
	String subcategory_name;
	long maincategory_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Transient
	@JoinColumn(name="maincategory_id",referencedColumnName="maincategory_id",insertable=false,updatable=false)
	private MainCategories maincategory;

	public SubCategories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategories(long subcategory_id, String subcategory_name, long maincategory_id,
			MainCategories maincategory) {
		super();
		this.subcategory_id = subcategory_id;
		this.subcategory_name = subcategory_name;
		this.maincategory_id = maincategory_id;
		this.maincategory = maincategory;
	}

	public long getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(long subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public String getSubcategory_name() {
		return subcategory_name;
	}

	public void setSubcategory_name(String subcategory_name) {
		this.subcategory_name = subcategory_name;
	}

	public long getMaincategory_id() {
		return maincategory_id;
	}

	public void setMaincategory_id(long maincategory_id) {
		this.maincategory_id = maincategory_id;
	}

	public MainCategories getMaincategory() {
		return maincategory;
	}

	public void setMaincategory(MainCategories maincategory) {
		this.maincategory = maincategory;
	}

	@Override
	public String toString() {
		return "SubCategories [subcategory_id=" + subcategory_id + ", subcategory_name=" + subcategory_name
				+ ", maincategory_id=" + maincategory_id + ", maincategory=" + maincategory + "]";
	}

	
	
	
}
