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
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id", unique = true, nullable = false)
	long customer_id;
	String first_name;
	String middle_name;
	String last_name;
	String address;
	String city;
	long pincode;
	long phone;
	String email_id;
	String date;
	int age;
	String gender;
	String date_of_birth;
	long package_id;	
	long signup_id;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="package_id",referencedColumnName="package_id",insertable=false,updatable=false)
	private TourPackages tourpack;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="signup_id",referencedColumnName="signup_id",insertable=false,updatable=false)
	private SignUp signup;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(long customer_id, String first_name, String middle_name, String last_name, String address,
			String city, long pincode, long phone, String email_id, String date, int age, String gender,
			String date_of_birth, long package_id, long signup_id, TourPackages tourpack, SignUp signup) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.phone = phone;
		this.email_id = email_id;
		this.date = date;
		this.age = age;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.package_id = package_id;
		this.signup_id = signup_id;
		this.tourpack = tourpack;
		this.signup = signup;
	}


	public long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getMiddle_name() {
		return middle_name;
	}


	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDate_of_birth() {
		return date_of_birth;
	}


	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}


	public long getPackage_id() {
		return package_id;
	}


	public void setPackage_id(long package_id) {
		this.package_id = package_id;
	}


	public long getSignup_id() {
		return signup_id;
	}


	public void setSignup_id(long signup_id) {
		this.signup_id = signup_id;
	}


	public TourPackages getTourpack() {
		return tourpack;
	}


	public void setTourpack(TourPackages tourpack) {
		this.tourpack = tourpack;
	}


	public SignUp getSignup() {
		return signup;
	}


	public void setSignup(SignUp signup) {
		this.signup = signup;
	}


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", address=" + address + ", city=" + city + ", pincode=" + pincode
				+ ", phone=" + phone + ", email_id=" + email_id + ", date=" + date + ", age=" + age + ", gender="
				+ gender + ", date_of_birth=" + date_of_birth + ", package_id=" + package_id + ", signup_id="
				+ signup_id + ", tourpack=" + tourpack + ", signup=" + signup + "]";
	}
	
	

}