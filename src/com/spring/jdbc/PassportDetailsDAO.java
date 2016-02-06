package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class PassportDetailsDAO implements PassportDetailsDAOIfc {

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate template){
		this.jdbcTemplate=template;
	}
	
	public int setPassportDetails(Passport passport){
		String query="insert into passport values("+
					passport.getRecordID()+ ","+
					passport.getPassID()+ ",'"+
					passport.getCountry()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updatePassportDetails(Passport passport){
		String query="";
		return jdbcTemplate.update(query);
	}
	
	public int deletePassportDetails(Passport passport){
		String query="";
		return jdbcTemplate.update(query);
	}
	
	public Passport passportDetails(int passID){
		String query="Select * from National where id=?";
		Passport passport=jdbcTemplate.queryForObject(query, new Object[]{passID}, new PassportMapper());
		return passport;
	}
}