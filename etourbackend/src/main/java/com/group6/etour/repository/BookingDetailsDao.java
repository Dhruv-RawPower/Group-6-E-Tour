package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.BookingDetails;

public interface BookingDetailsDao extends JpaRepository<BookingDetails, Long>{

}
