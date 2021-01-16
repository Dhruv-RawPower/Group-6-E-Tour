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
public class BookingHeader 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookingheader_id", unique = true, nullable = false)
	long bookingheader_id;
	long customer_id;
	int number_of_passengers;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id",referencedColumnName="customer_id",insertable=false,updatable=false)
	private Customer customer;

	public BookingHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingHeader(long bookingheader_id, long customer_id, int number_of_passengers, Customer customer) {
		super();
		this.bookingheader_id = bookingheader_id;
		this.customer_id = customer_id;
		this.number_of_passengers = number_of_passengers;
		this.customer = customer;
	}

	public long getBookingheader_id() {
		return bookingheader_id;
	}

	public void setBookingheader_id(long bookingheader_id) {
		this.bookingheader_id = bookingheader_id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public int getNumber_of_passengers() {
		return number_of_passengers;
	}

	public void setNumber_of_passengers(int number_of_passengers) {
		this.number_of_passengers = number_of_passengers;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "BookingHeader [bookingheader_id=" + bookingheader_id + ", customer_id=" + customer_id
				+ ", number_of_passengers=" + number_of_passengers + ", customer=" + customer + "]";
	}
	
	
	
}
