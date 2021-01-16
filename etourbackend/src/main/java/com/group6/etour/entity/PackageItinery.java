package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PackageItinery
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="itinery_id", unique = true, nullable = false)
	long itinery_id;
	String itinery_info;
	long package_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="package_id",referencedColumnName="package_id",insertable=false,updatable=false)
	private TourPackages tourpack;
	public PackageItinery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageItinery(long itinery_id, String itinery_info, long package_id, TourPackages tourpack) {
		super();
		this.itinery_id = itinery_id;
		this.itinery_info = itinery_info;
		this.package_id = package_id;
		this.tourpack = tourpack;
	}
	public long getItinery_id() {
		return itinery_id;
	}
	public void setItinery_id(long itinery_id) {
		this.itinery_id = itinery_id;
	}
	public String getItinery_info() {
		return itinery_info;
	}
	public void setItinery_info(String itinery_info) {
		this.itinery_info = itinery_info;
	}
	public long getPackage_id() {
		return package_id;
	}
	public void setPackage_id(long package_id) {
		this.package_id = package_id;
	}
	public TourPackages getTourpack() {
		return tourpack;
	}
	public void setTourpack(TourPackages tourpack) {
		this.tourpack = tourpack;
	}
	@Override
	public String toString() {
		return "PackageItinery [itinery_id=" + itinery_id + ", itinery_info=" + itinery_info + ", package_id="
				+ package_id + ", tourpack=" + tourpack + "]";
	}
	
}
