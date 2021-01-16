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
public class PackageCost 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="packcost_id", unique = true, nullable = false)
	long packcost_id;
	int couple_cost;
	int default_cost;
	int child_with_bed;
	int child_without_bed;
	int single;
	long package_id;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="package_id",referencedColumnName="package_id",insertable=false,updatable=false)
	private TourPackages tourpack;
	public PackageCost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackageCost(long packcost_id, int couple_cost, int default_cost, int child_with_bed, int child_without_bed,
			int single, long package_id, TourPackages tourpack) {
		super();
		this.packcost_id = packcost_id;
		this.couple_cost = couple_cost;
		this.default_cost = default_cost;
		this.child_with_bed = child_with_bed;
		this.child_without_bed = child_without_bed;
		this.single = single;
		this.package_id = package_id;
		this.tourpack = tourpack;
	}
	public long getPackcost_id() {
		return packcost_id;
	}
	public void setPackcost_id(long packcost_id) {
		this.packcost_id = packcost_id;
	}
	public int getCouple_cost() {
		return couple_cost;
	}
	public void setCouple_cost(int couple_cost) {
		this.couple_cost = couple_cost;
	}
	public int getDefault_cost() {
		return default_cost;
	}
	public void setDefault_cost(int default_cost) {
		this.default_cost = default_cost;
	}
	public int getChild_with_bed() {
		return child_with_bed;
	}
	public void setChild_with_bed(int child_with_bed) {
		this.child_with_bed = child_with_bed;
	}
	public int getChild_without_bed() {
		return child_without_bed;
	}
	public void setChild_without_bed(int child_without_bed) {
		this.child_without_bed = child_without_bed;
	}
	public int getSingle() {
		return single;
	}
	public void setSingle(int single) {
		this.single = single;
	}
	public long getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
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
		return "PackageCost [packcost_id=" + packcost_id + ", couple_cost=" + couple_cost + ", default_cost="
				+ default_cost + ", child_with_bed=" + child_with_bed + ", child_without_bed=" + child_without_bed
				+ ", single=" + single + ", package_id=" + package_id + ", tourpack=" + tourpack + "]";
	}
	
	
		
}