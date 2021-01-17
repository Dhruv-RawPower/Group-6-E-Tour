package com.group6.etour.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.entity.BookingHeader;
import com.group6.etour.repository.BookingHeaderDao;
import com.group6.etour.services.BookingHeaderService;

@Service
public class BookingHeaderServiceImpl implements BookingHeaderService {

	@Autowired
	private BookingHeaderDao bookingheaderDao;
	
	@Override
	public BookingHeader addBookingHeader(BookingHeader bookhead) {
		// TODO Auto-generated method stub
		bookingheaderDao.save(bookhead);
		return bookhead;
	}

}
