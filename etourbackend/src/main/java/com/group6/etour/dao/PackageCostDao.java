package com.group6.etour.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.PackageCost;

public interface PackageCostDao extends JpaRepository<PackageCost, Long>
{

}
