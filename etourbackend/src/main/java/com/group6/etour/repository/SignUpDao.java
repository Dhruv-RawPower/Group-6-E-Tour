package com.group6.etour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.group6.etour.entity.SignUp;



public interface SignUpDao extends JpaRepository<SignUp,Long>
{
	
	@Query(value="Select * from sign_up where sign_up.email_id= :ei and sign_up.password= :ps",nativeQuery=true)
	public SignUp authenticate(@Param("ei")String email_id,@Param("ps")String password);
	
}
