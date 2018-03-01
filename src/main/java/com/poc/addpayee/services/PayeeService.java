package com.poc.addpayee.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.poc.addpayee.daos.PayeeDao;
import com.poc.addpayee.model.AxisAccountModel;
import com.poc.addpayee.model.AxisPayeeModel;

@Component
public class PayeeService {
	
	@Autowired
	PayeeDao dao;

	public ArrayList getAllPayeeList() {
		System.out.println("Inside Service");
		return dao.getAllPayee();
	}

	public AxisAccountModel getAxisAccDetails(String acc_num,String phone_num) {
		System.out.println("Inside Service");
		return dao.getAxisAccDetails(acc_num,phone_num);
		
	}
	
	

	public Boolean checkBeneExist(String ownCust_num, String bene_acc_no) {
		
		return dao.checkBeneExist(ownCust_num,bene_acc_no);
	}

	public AxisAccountModel getAxisAccDetailsByCustID(String ownCust_num) {
		
		return dao.getAxisAccDetailsByCustID(ownCust_num);
	}
	
	public void insertAxisPayee(AxisAccountModel person, String ownCust_num) {
		AxisAccountModel myAccDetails = new AxisAccountModel();
		myAccDetails = dao.getAxisAccDetailsByCustID(ownCust_num);
		ArrayList allPayee = dao.getAllPayee();
		dao.insertAxisPayee(person,myAccDetails,allPayee.size());
		
		
	}

}
