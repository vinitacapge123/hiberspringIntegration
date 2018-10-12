package com.cg.controller;

public class Customer {

	private String name;
	private String mobile;
	private String mail;
	
	public Customer(String name, String mobile, String mail) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.mail = mail;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
