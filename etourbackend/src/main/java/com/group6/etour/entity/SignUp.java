package com.group6.etour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SignUp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="signup_id", unique = true, nullable = false)
	long signup_id;
	String email_id;
	String password;
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignUp(long signup_id, String email_id, String password)
	{
		super();
		this.signup_id = signup_id;
		this.email_id = email_id;
		this.password = password;
	}
	public long getSignup_id() {
		return signup_id;
	}
	public void setSignup_id(long signup_id) {
		this.signup_id = signup_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignUp [signup_id=" + signup_id + ", email_id=" + email_id + ", password=" + password + "]";
	}
	
}
