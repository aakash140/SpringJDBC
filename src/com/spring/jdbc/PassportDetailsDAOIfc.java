package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public interface PassportDetailsDAOIfc {

	public void setJdbcTemplate(JdbcTemplate template);
	
	public int setPassportDetails(Passport passport);
	
	public int updatePassportDetails(Passport passport);
	
	public int deletePassportDetails(Passport passport);
	
	public Passport passportDetails(int passID);
}
