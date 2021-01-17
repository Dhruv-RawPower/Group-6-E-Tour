package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.BookingHeader;

public interface BookingHeaderDao extends JpaRepository<BookingHeader, Long>
{

}
