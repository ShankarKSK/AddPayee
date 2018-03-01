package com.poc.addpayee.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.addpayee.model.AxisAccountModel;
import com.poc.addpayee.model.AxisPayeeModel;
import com.poc.addpayee.services.PayeeService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ft")
public class AddPayeeController {
	
	@Autowired
	PayeeService payeeService;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ArrayList<AxisPayeeModel> getAxisPayeeList(){
		ArrayList<AxisPayeeModel> allPayeeList = new ArrayList<AxisPayeeModel>();
		allPayeeList = payeeService.getAllPayeeList();
		return allPayeeList;
	}
	
	@RequestMapping(value="/axisOne",method=RequestMethod.GET)
	public AxisAccountModel getUserAccFromAxis(@RequestParam(value="acc_num", required=true) String acc_num,
			@RequestParam(value="phone_num", required=true) String phone_num){
		
		AxisAccountModel axisAcc = new AxisAccountModel();
		axisAcc = payeeService.getAxisAccDetails(acc_num,phone_num);
		return axisAcc;
		
	}
	
	
	@RequestMapping(value="/axisOneCust",method=RequestMethod.GET)
	public AxisAccountModel getUserAccFromAxis(@RequestParam(value="cust_Id", required=true) String cust_Id){
		
		AxisAccountModel axisAcc = new AxisAccountModel();
		axisAcc = payeeService.getAxisAccDetailsByCustID(cust_Id);
		return axisAcc;
		
	}
	
	@RequestMapping(value="/addAxis" ,method=RequestMethod.POST)
	public ResponseEntity addTOAxisPayeeList(@RequestParam(value="ownCust_num", required=true) String ownCust_num,
			@RequestBody AxisAccountModel person){
		
		if(person.getUser_Acc_num() != null){
			boolean isAlreadyExist  = payeeService.checkBeneExist(ownCust_num,person.getUser_Acc_num());
			if(!isAlreadyExist){
				System.out.println("Adding to DB");
				payeeService.insertAxisPayee(person,ownCust_num);
			}
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	

}
