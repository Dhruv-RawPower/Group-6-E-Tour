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
public class BookingDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookingdetails_id", unique = true, nullable = false)
	long bookingdetails_id;
	String full_name;
	String gender;
	String date_of_birth;
	int age;
	long bookingheader_id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="bookingheader_id",referencedColumnName="bookingheader_id",insertable=false,updatable=false)
	private BookingHeader bookingheader;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(long bookingdetails_id, String full_name, String gender, String date_of_birth, int age,
			long bookingheader_id, BookingHeader bookingheader) {
		super();
		this.bookingdetails_id = bookingdetails_id;
		this.full_name = full_name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.bookingheader_id = bookingheader_id;
		this.bookingheader = bookingheader;
	}
	public long getBookingdetails_id() {
		return bookingdetails_id;
	}
	public void setBookingdetails_id(long bookingdetails_id) {
		this.bookingdetails_id = bookingdetails_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getBookingheader_id() {
		return bookingheader_id;
	}
	public void setBookingheader_id(long bookingheader_id) {
		this.bookingheader_id = bookingheader_id;
	}
	public BookingHeader getBookingheader() {
		return bookingheader;
	}
	public void setBookingheader(BookingHeader bookingheader) {
		this.bookingheader = bookingheader;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingdetails_id=" + bookingdetails_id + ", full_name=" + full_name + ", gender="
				+ gender + ", date_of_birth=" + date_of_birth + ", age=" + age + ", bookingheader_id="
				+ bookingheader_id + ", bookingheader=" + bookingheader + "]";
	}
	
	
	
	
}
