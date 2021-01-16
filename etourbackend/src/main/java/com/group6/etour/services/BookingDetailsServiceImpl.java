package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.BookingDetailsDao;
import com.group6.etour.entity.BookingDetails;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {

	@Autowired
	private BookingDetailsDao bookingdetailsDao;
	
	@Override
	public BookingDetails addBookingDetails(BookingDetails bookdetails) {
		// TODO Auto-generated method stub
		bookingdetailsDao.save(bookdetails);
		return bookdetails;
	}

}
