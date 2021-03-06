package com.poc.addpayee.daos;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poc.addpayee.model.Mxotherbankbenemtb;
import com.poc.addpayee.model.Mxpullfundsbenemtb;



public interface MxpullfundsbenemtbRepository extends JpaRepository<Mxpullfundsbenemtb,Integer>{
	
	@Query(value="SELECT axis FROM Mxpullfundsbenemtb axis WHERE axis.customer_id = ?1")
	public ArrayList<Mxpullfundsbenemtb> searchRecipientCustId(String ownCust_Id);

}
