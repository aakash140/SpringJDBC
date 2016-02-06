package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NationalMapper implements RowMapper<National> {

	public National mapRow(ResultSet rs,int rowNum )throws SQLException{
		National national=new National();
		national.setRecordID(rs.getInt("Record"));
		national.setName(rs.getString("Name"));
		return national;
	}
}