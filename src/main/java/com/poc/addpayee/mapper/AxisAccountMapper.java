package com.poc.addpayee.mapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.poc.addpayee.model.AxisAccountModel;

public class AxisAccountMapper implements RowMapper,Serializable{

	@Override
	public AxisAccountModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AxisAccountModel model = new AxisAccountModel();
		model.setUser_id(rs.getString("User_id"));
		model.setUser_Name(rs.getString("User_Name"));
		model.setUser_Acc_num(rs.getString("User_Acc_num"));
		model.setCustomer_id(rs.getString("Customer_id"));
		model.setUser_phone_num(rs.getString("User_phone_num"));
		return model;
	}
	
	
}
