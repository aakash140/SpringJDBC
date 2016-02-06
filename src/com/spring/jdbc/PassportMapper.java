package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassportMapper implements RowMapper<Passport> {

	public Passport mapRow(ResultSet rs,int rowNum) throws SQLException{
		Passport passport=new Passport();
		passport.setRecordID(rs.getInt("Record"));
		passport.setPassID(rs.getInt("ID"));
		passport.setCountry(rs.getString("Country"));
		return passport;
	}
}
