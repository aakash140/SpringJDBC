package com.spring.jdbc;


public class Passport {

	private int recordID;
	private int passID;
	private String country;
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public int getPassID() {
		return passID;
	}
	public void setPassID(int passID) {
		this.passID = passID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}