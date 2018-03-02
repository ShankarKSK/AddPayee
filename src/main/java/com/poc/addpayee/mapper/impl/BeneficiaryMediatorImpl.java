package com.poc.addpayee.mapper.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.addpayee.daos.MxaxisbankbenemtbRepository;
import com.poc.addpayee.daos.MxotherbankRepository;
import com.poc.addpayee.daos.MxpullfundsbenemtbRepository;
import com.poc.addpayee.daos.MxupibenmtbRepository;
import com.poc.addpayee.daos.MxvmtbenmtbRepository;
import com.poc.addpayee.mapper.BeneficiaryMediator;
import com.poc.addpayee.model.Mxaxisbankbenemtb;
import com.poc.addpayee.model.Mxotherbankbenemtb;
import com.poc.addpayee.model.Mxpullfundsbenemtb;
import com.poc.addpayee.model.Mxupibenmtb;
import com.poc.addpayee.model.Mxvmtbenmtb;
@Component
public class BeneficiaryMediatorImpl implements BeneficiaryMediator{
	@Autowired
	MxaxisbankbenemtbRepository axisBankBenRep;
	@Autowired
	MxotherbankRepository otherBankRep;
	@Autowired
	MxpullfundsbenemtbRepository pullFundRepository;
	@Autowired
	MxvmtbenmtbRepository vmtRepository;
	@Autowired
	MxupibenmtbRepository upiRepository;
/*	@Autowired
	ValidationHelper validationHelper;*/
	@Override
	public  List<?> fetchDataBasedOnBank(String type) {
		List<?> resultList = new ArrayList<>();
		if (type.equalsIgnoreCase("Axis")) {
			resultList = (List<?>) axisBankBenRep.findAll();
		} else if (type.equalsIgnoreCase("Nonaxis")) {
			resultList = (List<?>) otherBankRep.findAll();
		}else if(type.equalsIgnoreCase("VMT")){
			resultList = (List<?>) vmtRepository.findAll();
		}else if(type.equalsIgnoreCase("Pull")){
			resultList = (List<?>) pullFundRepository.findAll();
		}else if(type.equalsIgnoreCase("Upi")){
			resultList = (List<?>) upiRepository.findAll();
		}
		return resultList;
	}
	@SuppressWarnings("rawtypes")
	@Override
	public List insertRecepient(String requestBody,String type) throws JsonParseException, JsonMappingException, IOException{
		List result = null;
		ObjectMapper mapper = new ObjectMapper();
		List errors = new ArrayList();
		if(type.equalsIgnoreCase("Axis")){
			Mxaxisbankbenemtb mxaxisbankbenemtb = mapper.readValue(requestBody, Mxaxisbankbenemtb.class);
			/*mxaxisbankbenemtb = validationHelper.validateFields(type,mxaxisbankbenemtb);*/
			axisBankBenRep.save(mxaxisbankbenemtb);
			result = axisBankBenRep.findAll();
		}else if(type.equalsIgnoreCase("NonAxis")){
			Mxotherbankbenemtb mxotherbankbenemtb = mapper.readValue(requestBody, Mxotherbankbenemtb.class);
			Integer tableCount = Integer.parseInt(String.valueOf(otherBankRep.count()));
			mxotherbankbenemtb.setBene_id(tableCount+1);
			otherBankRep.save(mxotherbankbenemtb);
			result =  otherBankRep.findAll();
		}else if(type.equalsIgnoreCase("VMT")){
			Mxvmtbenmtb mxvmtbenmtb =  mapper.readValue(requestBody, Mxvmtbenmtb.class);
			Integer tableCount = Integer.parseInt(String.valueOf(vmtRepository.count()));
			mxvmtbenmtb.setBene_id(tableCount+1);
			System.out.println(mxvmtbenmtb.getBene_id());
			vmtRepository.save(mxvmtbenmtb);
			result =  vmtRepository.findAll();
		}else if(type.equalsIgnoreCase("Pull")){
			Mxpullfundsbenemtb mxpullfundsbenemtb =  mapper.readValue(requestBody, Mxpullfundsbenemtb.class);
			pullFundRepository.save(mxpullfundsbenemtb);
			result = pullFundRepository.findAll();
		}else if(type.equalsIgnoreCase("Upi")){
			Mxupibenmtb mxupibenmtb = mapper.readValue(requestBody, Mxupibenmtb.class);
			upiRepository.save(mxupibenmtb);
			result=upiRepository.findAll();
		}
		return result;
	}
	@Override
	public List<?> searchRecepient(String acc_num,String phone_num,String cust_id,String type){
		List<?> searchResult = new ArrayList();
		if(type.equalsIgnoreCase("Axis")){
			if(null!=cust_id){
				searchResult = axisBankBenRep.searchRecipientCustId(cust_id);
			}else if(null != acc_num){
				searchResult = axisBankBenRep.searchRecipientAccNum(acc_num);
			}
		}/*else if(type.equalsIgnoreCase("Others")){
			searchResult = otherBankRep.searchRecipientAccNum(acc_num);
		}*/
		return searchResult;
	}
}
