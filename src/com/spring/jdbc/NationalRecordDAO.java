package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class NationalRecordDAO implements  NationalRecordDAOIfc{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate template){
		this.jdbcTemplate=template;
	}
	
	public int setNationalDetails(National national){
		String query="insert into national values("+ 
				national.getRecordID() + ",'"+
				national.getName() + "',"+
				national.getPassportDetails().getPassID()+")";
		return jdbcTemplate.update(query);
	}
	
	public int updateNationalDetails(National national){
		String query="update national set name="+
					national.getName()+
					"where passport="+national.getPassportDetails().getPassID();
		return jdbcTemplate.update(query);
	}
	
	public int deleteNationalDetails(National national){
		String query="delete from national where name="+
						national.getName();
		return jdbcTemplate.update(query);
	}
	
	public National nationalDetails(int passID){
		String query="Select * from National where id=?";
		National national=jdbcTemplate.queryForObject(query, new Object[]{passID}, new NationalMapper());
		return national;
	}
}