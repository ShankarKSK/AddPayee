package com.poc.addpayee.controller;

import java.io.IOException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.poc.addpayee.daos.MxaxisbankbenemtbRepository;
import com.poc.addpayee.mapper.BeneficiaryMediator;
import com.poc.addpayee.model.Mxaxisbankbenemtb;



@RestController
@RequestMapping("/ft/benificiaries")
public class Beneficiary {
	
	@Autowired
	BeneficiaryMediator beneficiaryMediator;
	@Autowired
	MxaxisbankbenemtbRepository usersRepository;
	
	@GetMapping(value="/getRecipients")
	public ResponseEntity getAll(@RequestParam(value ="type",required=false ,defaultValue="Axis") String type,
			@RequestParam(value ="custId",required=true) String cust_id	)
	{
		ResponseEntity responseEntity;
		List responseList;
		try{
			responseList  =beneficiaryMediator.fetchDataBasedOnBank(type,cust_id);
			responseEntity = new ResponseEntity(responseList,HttpStatus.OK);
		}catch(Exception e){
			responseEntity = new ResponseEntity("Invalid input",HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
	@PostMapping(value="/insertRecipients")
	public List<Mxaxisbankbenemtb> persist(@RequestParam(value ="type",required=true)String type,@RequestParam(value ="ownCust_num",required=true)String ownCust_num,@RequestBody String requestBody) throws JsonParseException, JsonMappingException, IOException
	{	
			List responseList;
			responseList = beneficiaryMediator.insertRecepient(requestBody,type);
			return responseList;
	}
	@GetMapping(value="/searchRecipients")
	public ResponseEntity search(@RequestParam(value="acc_num", required=false) String acc_num,
			@RequestParam(value="phone_num", required=false) String phone_num,
			@RequestParam(value="cust_id", required=false) String cust_id,
			@RequestParam(value ="type",required=false ,defaultValue="Axis")String type)throws JsonParseException, JsonMappingException, IOException
	{	
			List<Mxaxisbankbenemtb> mxaxisbankbenemtbs;
			if(null == acc_num && null == phone_num && null == cust_id){
				return new ResponseEntity("Kindly enter a phone number or account number or a customer id", HttpStatus.BAD_REQUEST);
			}else{
				List responseList;
				responseList = beneficiaryMediator.searchRecepient(acc_num,phone_num,cust_id,type);
				return new ResponseEntity(responseList,HttpStatus.ACCEPTED) ;
			}
	}
}
