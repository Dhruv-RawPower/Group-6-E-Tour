package com.group6.etour.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.TourDate;

public interface TourDateDao extends JpaRepository<TourDate,Long>
{

}
