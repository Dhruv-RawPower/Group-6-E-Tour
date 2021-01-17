package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group6.etour.entity.PackageCost;

public interface PackageCostDao extends JpaRepository<PackageCost, Long>
{

}
