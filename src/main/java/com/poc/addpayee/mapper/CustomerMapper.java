package com.poc.addpayee.mapper;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.poc.addpayee.model.AxisPayeeModel;

public class CustomerMapper implements RowMapper,Serializable{
	@Override
	public AxisPayeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AxisPayeeModel model = new AxisPayeeModel();
		model.setBene_nick_name(rs.getString("bene_nick_name"));
		model.setBene_acc_no(rs.getString("bene_acc_no"));
		model.setCustomer_id(rs.getString("customer_id"));
		return model;
	}

	

}
