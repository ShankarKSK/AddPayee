package com.poc.addpayee.daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poc.addpayee.model.Mxotherbankbenemtb;
import com.poc.addpayee.model.Mxupibenmtb;



public interface MxupibenmtbRepository extends JpaRepository<Mxupibenmtb,Integer> {
	@Query(value="SELECT axis FROM Mxupibenmtb axis WHERE axis.customer_id = ?1")
	public ArrayList<Mxupibenmtb> searchRecipientCustId(String ownCust_Id);

}
