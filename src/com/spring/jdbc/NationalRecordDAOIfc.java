package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public interface NationalRecordDAOIfc {

	public void setJdbcTemplate(JdbcTemplate template);
	
	public int setNationalDetails(National national);
	
	public int updateNationalDetails(National national);
	
	public int deleteNationalDetails(National national);
	
	public National nationalDetails(int passID);
}