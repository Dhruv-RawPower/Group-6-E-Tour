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
public class TourDate
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="date_id", unique = true, nullable = false)
	long date_id;
	String start_date;
	String end_date;
	long package_id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="package_id",referencedColumnName="package_id",insertable=false,updatable=false)
	private TourPackages tourpack;
	public TourDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TourDate(long date_id, String start_date, String end_date, long package_id, TourPackages tourpack) {
		super();
		this.date_id = date_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.package_id = package_id;
		this.tourpack = tourpack;
	}
	public long getDate_id() {
		return date_id;
	}
	public void setDate_id(long date_id) {
		this.date_id = date_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
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
		return "TourDate [date_id=" + date_id + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", package_id=" + package_id + ", tourpack=" + tourpack + "]";
	}
	
}
