package com.poc.addpayee.mapper;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
@Component
public interface BeneficiaryMediator {
	
	
	<T> List<T> fetchDataBasedOnBank(String type) ;
	List insertRecepient(String requestBody,String type)throws JsonParseException, JsonMappingException, IOException;
	List<?> searchRecepient(String acc_num,String phone_num,String cust_id,String type);
/*	public boolean checkBeneExist(String ownCust_Id, String bene_acc_no) {
		ArrayList<String> result = axisBankBenRep.checkBeneExist(ownCust_Id, bene_acc_no);
		if(result.size()>0){
			return true;
		}else{
			return false;
		}
	}*/

}
