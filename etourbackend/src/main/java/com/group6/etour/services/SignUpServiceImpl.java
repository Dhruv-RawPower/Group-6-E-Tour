package com.group6.etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group6.etour.dao.SignUpDao;
import com.group6.etour.entity.SignUp;

@Service
public class SignUpServiceImpl implements SignUpService {
    
	@Autowired
	private SignUpDao  signupDao;
	
	@Override
	public SignUp addSignUp(SignUp signup) {
		// TODO Auto-generated method stub
		signupDao.save(signup);
		return signup;
	}

}
