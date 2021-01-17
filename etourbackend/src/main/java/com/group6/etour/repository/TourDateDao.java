package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.TourDate;

public interface TourDateDao extends JpaRepository<TourDate,Long>
{

}
