package com.poc.addpayee.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.poc.addpayee.mapper.AxisAccountMapper;
import com.poc.addpayee.mapper.CustomerMapper;
import com.poc.addpayee.model.AxisAccountModel;
import com.poc.addpayee.model.AxisPayeeModel;

@Repository
public class PayeeDao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 @Autowired
	 public PayeeDao(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }
	
	public ArrayList getAllPayee() {
		System.out.println("Inside Dao -- "+jdbcTemplate);
		String sql = "select bene_nick_name,bene_acc_no,customer_id from mxaxisbankbenemtb";
		AxisPayeeModel model = new AxisPayeeModel();
		ArrayList accountAvailable = new ArrayList<>();
		accountAvailable = (ArrayList) jdbcTemplate.query(sql, new CustomerMapper());
		System.out.println(accountAvailable.size());
		return accountAvailable;
	}

	public AxisAccountModel getAxisAccDetails(String acc_num,String phone_num) {
		String sql= "SELECT User_id,Customer_id,User_Name,User_Acc_num,User_phone_num FROM AXIS_ACCOUNTS WHERE ";
		
		if(acc_num != null && !acc_num.equals("")){
			sql=sql+"User_Acc_num ="+acc_num;
		}else{
			sql=sql+"User_phone_num ="+phone_num;
		}
		AxisAccountModel axisModel = new AxisAccountModel();
		
		axisModel = (AxisAccountModel) jdbcTemplate.query(sql, new ResultSetExtractor<AxisAccountModel>(){

			@Override
			public AxisAccountModel extractData(ResultSet rs) throws SQLException, DataAccessException {
				AxisAccountModel model = new AxisAccountModel();
				while(rs.next()){
					model.setUser_id(rs.getString("User_id"));
					model.setUser_Name(rs.getString("User_Name"));
					model.setUser_Acc_num(rs.getString("User_Acc_num"));
					model.setCustomer_id(rs.getString("Customer_id"));
					model.setUser_phone_num(rs.getString("User_phone_num"));
					break;
				}
				return model;
				
			}
			
		});
				
			
		
		return axisModel;
		
		
	}

	public Boolean checkBeneExist(String ownCust_Id, String bene_acc_no) {
		String sql = "SELECT BENE_ID FROM mxaxisbankbenemtb WHERE customer_id = '"+ownCust_Id+"' and bene_acc_no ='"+bene_acc_no+"'";
		
		ArrayList<String> bene_id = (ArrayList<String>) jdbcTemplate.queryForList(sql,String.class);
		
		if(bene_id.size()>0){
			return true;
		}else{
			return false;
		}
	}

	public AxisAccountModel getAxisAccDetailsByCustID(String ownCust_num) {
		String sql= "SELECT User_id,Customer_id,User_Name,User_Acc_num,User_phone_num FROM AXIS_ACCOUNTS WHERE ";
		
		if(ownCust_num != null && !ownCust_num.equals("")){
			sql=sql+"Customer_id ="+ownCust_num;
		}
		AxisAccountModel axisModel = new AxisAccountModel();
		
		axisModel = (AxisAccountModel) jdbcTemplate.query(sql, new ResultSetExtractor<AxisAccountModel>(){

			@Override
			public AxisAccountModel extractData(ResultSet rs) throws SQLException, DataAccessException {
				AxisAccountModel model = new AxisAccountModel();
				while(rs.next()){
					model.setUser_id(rs.getString("User_id"));
					model.setUser_Name(rs.getString("User_Name"));
					model.setUser_Acc_num(rs.getString("User_Acc_num"));
					model.setCustomer_id(rs.getString("Customer_id"));
					model.setUser_phone_num(rs.getString("User_phone_num"));
					break;
				}
				return model;
				
			}
			
		});
				
			
		
		return axisModel;
				
	}

	public void insertAxisPayee(AxisAccountModel person, AxisAccountModel myAccDetails,int size) {
		String insertSql = "INSERT INTO mxaxisbankbenemtb (BANK_ID,bay_user_id,bene_id,"
				+ "reg_mobile_no,is_del_flag,mod_by,mod_on,created_by,created_on,consumer_code,bene_status,bene_nick_name,bene_acc_name,"
				+ "bene_acc_cat,bene_acc_type,bene_acc_currency,bene_acc_no,bene_branch_id,customer_id,channel_id,"
				+ "ip_address,bene_ifsc_code,cooling_period,bene_payee_type) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String bene_Id = size+1+"";
		Object[] params = new Object[] { "211",myAccDetails.getCustomer_id(),bene_Id.trim(),myAccDetails.getUser_phone_num()
				,'N',myAccDetails.getUser_id(),new Date(),myAccDetails.getUser_id(),new Date(),"AXIS","ACTIVE",person.getUser_Name(),
				person.getUser_Name(),"SAVING","SBA","INR",person.getUser_Acc_num(),"SOMEBRANCH",myAccDetails.getCustomer_id(),"123",
				"121.17.10.6","UTIB0000074","10","SOMETYPE"};
		
		int[] types= new int[] { Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.CHAR,
				Types.VARCHAR,
				Types.DATE,
				Types.VARCHAR,
				Types.DATE,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				Types.VARCHAR,
				
		};
		
		int row = jdbcTemplate.update(insertSql, params, types);
		
		System.out.println(row + " row inserted.");


		
	}

}
