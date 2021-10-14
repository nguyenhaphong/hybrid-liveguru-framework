package com.am.woman;

public class NguyenKyDuyen {
	// private
	// default
	// protected
	// public
	
	// private
	private String name = "Ngoc Hang";
	private String address = "25 ABC - P. ABC";
	
	// default
	String dateOfBirth = "01/01/1999";
	
	String getWomanDateOfBirth () {
		return this.dateOfBirth;
	}
	
	//protected
	protected String womanID = "001033336363";
	
	protected String getWomanID() {
		return this.womanID;
	}
	
	// public
	public String sex = "Woman";
	
	public String getWomanSex() {
		return this.sex;
	}
	
	// Method
	private String getWomanName () {
		return name;
	}
	
	private String getWomanAddress () {
		return address;
	}
	
	private void setWomanName (String name) {
		this.name = name;
	}
	
	

}
