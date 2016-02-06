package com.spring.jdbc;


public class National {

	private int recordID;
	private String name;
	private Passport passportDetails;
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Passport getPassportDetails() {
		return passportDetails;
	}
	public void setPassportDetails(Passport passportDetails) {
		this.passportDetails = passportDetails;
	}
}