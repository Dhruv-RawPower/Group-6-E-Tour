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
public class TourPackages 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="package_id", unique = true, nullable = false)
	private long package_id;
	String package_name;
	int period_day;
	int period_night;	
	String stay_meal;
	String passport;
	String weather;
	String dosanddonts;
	String video;
	String photo;
	
	long catmaster_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Transient
	@JoinColumn(name="catmaster_id",referencedColumnName="catmaster_id",insertable=false,updatable=false)
	private CategoryMaster catmaster;

	public TourPackages(long package_id, String package_name, int period_day, int period_night, String stay_meal,
			String passport, String weather, String dosanddonts, String video, String photo, long catmaster_id,
			CategoryMaster catmaster) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
		this.period_day = period_day;
		this.period_night = period_night;
		this.stay_meal = stay_meal;
		this.passport = passport;
		this.weather = weather;
		this.dosanddonts = dosanddonts;
		this.video = video;
		this.photo = photo;
		this.catmaster_id = catmaster_id;
		this.catmaster = catmaster;
	}

	@Override
	public String toString() {
		return "TourPackages [package_id=" + package_id + ", package_name=" + package_name + ", period_day="
				+ period_day + ", period_night=" + period_night + ", stay_meal=" + stay_meal + ", passport=" + passport
				+ ", weather=" + weather + ", dosanddonts=" + dosanddonts + ", video=" + video + ", photo=" + photo
				+ ", catmaster_id=" + catmaster_id + ", catmaster=" + catmaster + "]";
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

	public int getPeriod_day() {
		return period_day;
	}

	public void setPeriod_day(int period_day) {
		this.period_day = period_day;
	}

	public int getPeriod_night() {
		return period_night;
	}

	public void setPeriod_night(int period_night) {
		this.period_night = period_night;
	}

	public String getStay_meal() {
		return stay_meal;
	}

	public void setStay_meal(String stay_meal) {
		this.stay_meal = stay_meal;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getDosanddonts() {
		return dosanddonts;
	}

	public void setDosanddonts(String dosanddonts) {
		this.dosanddonts = dosanddonts;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getCatmaster_id() {
		return catmaster_id;
	}

	public void setCatmaster_id(long catmaster_id) {
		this.catmaster_id = catmaster_id;
	}

	public CategoryMaster getCatmaster() {
		return catmaster;
	}

	public void setCatmaster(CategoryMaster catmaster) {
		this.catmaster = catmaster;
	}

	public TourPackages() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
