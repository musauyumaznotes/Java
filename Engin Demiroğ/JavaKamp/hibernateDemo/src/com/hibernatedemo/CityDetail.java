package com.hibernatedemo;

public class CityDetail {
	private String countryCode;
	private int count;
	
	
	
	public CityDetail(String countryCode, int count) {
		super();
		this.countryCode = countryCode;
		this.count = count;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
