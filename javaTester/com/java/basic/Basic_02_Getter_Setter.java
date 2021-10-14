package com.java.basic;

public class Basic_02_Getter_Setter {
	static String carName;
	
	public static void main(String[] args) {
		setCarName ("Santafe");
		
	}
	
	// Setter method: Gán dữ liệu
	public static void setCarName (String carName_) {
		carName = carName_;
	}
	
	// Getter method: Lấy dữ liệu
	public static String getCarName () {
		return carName;
	}

}
