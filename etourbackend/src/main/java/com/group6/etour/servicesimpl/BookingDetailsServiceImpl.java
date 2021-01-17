package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.BookingDetails;
import com.group6.etour.repository.BookingDetailsDao;
import com.group6.etour.services.BookingDetailsService;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService 
{

	@Autowired
	private BookingDetailsDao bookingdetailsDao;
	
	@Override
	public BookingDetails addBookingDetails(BookingDetails bookdetails) {
		// TODO Auto-generated method stub
		bookingdetailsDao.save(bookdetails);
		return bookdetails;
	}

}
