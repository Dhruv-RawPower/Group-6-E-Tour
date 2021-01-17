package com.group6.etour.dto;

public class SubPackages
{
	String package_name;

	public SubPackages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubPackages(String package_name) {
		super();
		this.package_name = package_name;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	@Override
	public String toString() {
		return "SubPackages [package_name=" + package_name + "]";
	}
	
	
}
